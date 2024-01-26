package test.java9;

import java.util.Scanner;

public class java9_4 {
    static int sum(int num) {
        return num*9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();
        int num2 = sum(num1);
        System.out.println(num1 + " の 9 倍は " +num2+ " です。");
        scanner.close();

    }
}
// 6 の 