package test.java14;

import java.util.Scanner;

public class java14_4 {
    public static void main(String[] args) {
        Scanner sI = new Scanner(System.in);
        System.out.println("文字列を 2 つ入力してください。");
        System.out.print("1 つ目文字列を入力："); String str1 = sI.nextLine();
        System.out.print("2 つ目文字列を入力："); String str2 = sI.nextLine();
        if (str1.equals(str2))
            System.out.println("同じ文字列です。");
        else
            System.out.println("違う文字列です。");
    }
}

//  
// ABC 
// ABC 
// 