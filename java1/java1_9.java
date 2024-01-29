// -*- coding: utf-8 -*-
// Scanner stdIn = new Scanner(System.in) ;
package test.java1;
import java.util.Scanner;
public class java1_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("お名前を入力してください＞");
        String str = stdIn.next();
        System.out.println("こんにちは"+str+"さん！");
    }
}
