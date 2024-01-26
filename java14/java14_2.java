package test.java14;

import java.util.Scanner;

public class java14_2 {
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String str = sI.nextLine();
        int sum = 0;
    for (int i = 0; i < str.length(); i++){
        sum+=1;
        }
        System.out.println("入力された文字数は " + sum + " です。");
    }
}
// public static void main(String[] args) {
//     Scanner stdIn = new Scanner(System.in);
//    System.out.print("入力文字：");
//    String str = stdIn.nextLine();
//    // System.out.print("終了数：");
//    // int m = stdIn.nextInt();
   
//        // System.out.print();
//        // sum+=i;
         
