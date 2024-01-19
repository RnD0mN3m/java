package test.java5;

// Scanner クラスを使用するためのインポート
import java.util.Scanner;

public class java5_1 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        System.out.print("A～D の値を入力してください：");
        
        // ユーザーからの入力を受け取る
        String scoa = stdIn.nextLine();

        // 入力された値に応じて評価を表示する
        switch (scoa) {
            case "A":
                System.out.println("ランク A は評価「優」です");
                break;    
            case "B":
                System.out.println("ランク B は評価「良」です");
                break;
            case "C":
                System.out.println("ランク C は評価「可」です");
                break;
            case "D":
                System.out.println("ランク D は評価「不可」です");
                break;
        }
    }

}
