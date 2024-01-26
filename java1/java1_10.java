package test.java1;
import java.util.Scanner;
public class java1_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字の入力：");
        String str = stdIn.next();
        System.out.print("整数の入力：");
        String num = stdIn.next();
        System.out.print("少数の入力：");
        String qwe = stdIn.next();
        System.out.println("入力された文字"+str);
        System.out.println("入力された整数"+num);
        System.out.println("入力された少数"+qwe);
    }
}
