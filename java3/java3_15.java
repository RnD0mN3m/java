package test.java3;

import java.util.Scanner;

public class java3_15 {
    
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("三角形の面積を求めます");
        System.out.print("底辺の長さ:");
        int bottom = sI.nextInt();
        System.out.print("高さ:");
        int height = sI.nextInt();
        double area = bottom*height/2;
        System.out.println("三角形の面積 = " + area);
    }
} 
