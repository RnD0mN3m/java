package test.java14;

import java.util.Scanner;

public class java14_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーからの文字列入力を受け取る
        System.out.print("文字列を入力：");
        String inputString = scanner.nextLine();

        // StringBuilderを使用して文字列を生成
        StringBuilder result = new StringBuilder(inputString);

        // 文字列が11文字以上の場合、11文字目以降を削除
        if (result.length() >= 11) {
            result.setLength(10);
        }

        // 結果を表示
        System.out.println("結果文字列：" + result.toString());

        // Scannerを閉じる
        scanner.close();
    }
}

// 01234567890123 
