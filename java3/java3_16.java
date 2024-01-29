package test.java3;

import java.util.Scanner;

public class java3_16 {
    
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("円の面積を求めます");
        System.out.print("半径:");
        int num = sI.nextInt();
        double PI = 3.14159;
        double area = num*num*PI;
        System.out.println("円の面積 = " + area);
    }
} 
