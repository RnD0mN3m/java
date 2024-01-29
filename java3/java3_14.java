package test.java3;

import java.util.Scanner;

public class java3_14 {
    
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("長方形の面積を求めます");
        System.out.print("縦の長さ：");
        int vertical = sI.nextInt();
        System.out.print("横の長さ：");
        int horizontal = sI.nextInt();
        double area = vertical*horizontal;
        System.out.println("長方形の面積 ＝ " + area);
    }
} 
