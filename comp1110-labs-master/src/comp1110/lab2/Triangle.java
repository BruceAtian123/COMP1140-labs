package comp1110.lab2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int a = 0;a<n-i;a++){
                System.out.print(" ");
            }
            for(int b =1;b<=(i-1)*2+1;b++){
                if(i==1||i==n){
                    System.out.print("*");
                }else{
                    if(b==1||b==(i-1)*2+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }
}
