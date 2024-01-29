package test.java3;

import java.util.Scanner;

public class java3_18 {
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("税込価格を求めます");
        System.out.print("定価:"); int num1 = sI.nextInt();
        System.out.print("消費税率:"); int num2 = sI.nextInt();
        double area = (num2/100.0+1)*num1;
        System.out.println("税率 = " + num1);
        System.out.println("定価 = " + num2);
        System.out.printf("税込価格 = %.0f" , area);
    }
}
