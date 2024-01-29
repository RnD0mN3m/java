package test.java3;

import java.util.Scanner;

public class java3_17 {
    
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("台形の面積を求めます");
        System.out.print("上底の長さ:");
        int upper = sI.nextInt();
        System.out.print("下底の長さ:");
        int bottom = sI.nextInt();
        System.out.print("高さ:");
        double height = sI.nextDouble();
        double area = (upper + bottom)*height/2;
        System.out.printf("台形の面積 = " + area);
    }
} 
 