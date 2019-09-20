package comp1110.lab5;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Ants extends Application {

    private Rectangle rectBasicTimeline;
    private Timeline timeline;

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Do Animation");
        int x = new Random().nextInt(500);
        int y = new Random().nextInt(400);
        rectBasicTimeline = new Rectangle(x, y, 100, 50);
        rectBasicTimeline.setFill(Color.RED);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                final Timeline timeline = new Timeline();
                timeline.setCycleCount(Timeline.INDEFINITE);
                timeline.setAutoReverse(true);
                final KeyValue kx = new KeyValue(rectBasicTimeline.xProperty(), x + 200);
                final KeyValue ky = new KeyValue(rectBasicTimeline.yProperty(), y + 200);
                final KeyValue kScale = new KeyValue(rectBasicTimeline.scaleXProperty(), 2);
                final KeyValue kFade = new KeyValue(rectBasicTimeline.opacityProperty(), 0);
                final KeyFrame kf = new KeyFrame(Duration.millis(3000), kx, ky, kScale, kFade);
                timeline.getKeyFrames().add(kf);
                timeline.play();
            }
        });

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(btn, rectBasicTimeline);
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Ant");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
