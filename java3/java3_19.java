package test.java3;

import java.util.Scanner;

// public class java3_19 {
//     public static void main(String[] args) {
//         Scanner sI = new Scanner(System.in);
//         System.out.println("BMI値を求めます");
//         System.out.print("身長(cm):"); int num1 = sI.nextInt();
//         System.out.print("体重(kg):"); int num2 = sI.nextInt();
//         double num3 = num1/100.00;
//         double bmi = num2/(num3*num3);
//         System.out.printf("BMI値 = " + bmi);
//     }
// }
public class java3_19 {
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.print("ハンバーガー　　　: "); int han = sI.nextInt();
        System.out.print("シェイク　　　　　: "); int sye = sI.nextInt();
        System.out.print("コーラ　　　　　　: "); int kor = sI.nextInt();
        int total_a = han + sye + kor;
        System.out.println("合計額（税抜）　　: " + total_a);
        double tax = total_a*0.1;
        System.out.println("消費税　　　　　　: " + tax);
        double chip = total_a*0.16;
        System.out.println("チップ　　　　　　: " + chip);
        double total_b = total_a + tax + chip;
        System.out.printf("合計額（税込）　　: %.0f" , total_b);
    }
}
