package test.java11;

import java.util.Scanner;

class Circle {
    // 円周率を定義
    private static final double PI = 3.1415;

    // 半径
    private int han;

    // コンストラクタ
    public Circle(int han) {
        this.han = han;
    }

    // 円周の長さを求めるメソッド
    public double Circumference() {
        return 2 * han * PI;
    }

    // 円の面積を求めるメソッド
    public double Area() {
        return han * han * PI;
    }
}

public class java11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 半径をユーザーに入力してもらう
        System.out.print("半径を整数値で入力：");
        int han = scanner.nextInt();

        // Circleクラスのインスタンスを生成
        Circle circle = new Circle(han);

        // 円周の長さを求めて表示
        double circumference = circle.Circumference();
        System.out.printf("円周の長さは %.3f です。\n", circumference);

        // 円の面積を求めて表示
        double area = circle.Area();
        System.out.printf("円の面積は %.3f です。\n", area);
    }
}
