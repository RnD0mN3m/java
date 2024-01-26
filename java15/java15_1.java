package test.java15;

// import java.util.Scanner;

// public class java15_1 {
//     public static void main(String[] args) {
//         Scanner sI = new Scanner(System.in);
//         try {
//             System.out.print("整数 1 = "); int num1 = sI.nextInt();
//             System.out.print("整数 2 = "); int num2 = sI.nextInt();
//             double num = num1/num2;
//             System.out.println(num1 + "/" + num2 + "=" + num);
//         } catch (ArithmeticException e) {
//             System.out.println("0 による割り算です！！");
//         }
//         System.out.print("処理終了");
//     }
// }

import java.util.Scanner;

public class java15_1 {
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        try {
            System.out.print("整数を入力 = "); int num1 = sI.nextInt();
            if (num1%2==0){
                 System.out.print(num1 + " は偶数");
            }
            else{
                System.out.print(num1 + " は奇数");
            }
        } catch (Exception e) {
            System.out.println("整数と認識できません！！");
        }
    }
}
