package comp1110.lab5;

import javafx.animation.*;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

import static java.lang.Math.random;

public class Ant extends Application{
    private Circle c1;
    @Override
    public void start(Stage stage) throws Exception
    {
        Group group = new Group();
        Group ants = new Group();
        final Scene scene = new Scene(group, 600, 600, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Ant");

        for(int i =0;i<50;i++){
            Circle ant = new Circle(1,Color.BLACK);
            ant.setOpacity(1);
            ants.getChildren().add(ant);
        }
        group.getChildren().add(ants);
        Timeline timeline = new Timeline();
        Random random = new Random();
        for(Node ant:ants.getChildren()){
            timeline.getKeyFrames().addAll(
                    new KeyFrame(Duration.ZERO,
                            new KeyValue(ant.translateXProperty(),random()*600),
                            new KeyValue(ant.translateYProperty(),random()*600)),
                    new KeyFrame(new Duration(40000),
                            new KeyValue(ant.translateXProperty(),random()*600),
                            new KeyValue(ant.translateYProperty(),random()*600))
            );
        }
        timeline.play();
        stage.show();

    }

    public static void main(final String[] arguments)
    {
        Application.launch(arguments);
    }
}
