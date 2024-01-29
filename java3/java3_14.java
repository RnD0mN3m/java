package test.java3;

import java.util.Scanner;

public class java3_11 {
    
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.print("文字列 1:");
        String str1 = sI.nextLine();
        System.out.print("文字列 2:");
        String str2 = sI.nextLine();
        System.out.println(str2+str1);
    }
}
