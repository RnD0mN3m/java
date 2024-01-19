// package test.java6;

// import java.util.Scanner;

// public class java6_6 {
//     public static void main(String[] args) {
//          Scanner stdIn = new Scanner(System.in);
//         System.out.print("開始数：");
//         int n = stdIn.nextInt();
//         System.out.print("終了数：");
//         int m = stdIn.nextInt();
//         int sum = 0;
//         for (int i = n; i <= m; i++)
//             // System.out.print();
//             sum+=i;
//             System.out.println("合 計："+sum);  
//     }
// }
package test.java6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java6_6 {
    public static void main(String[] args) {
         Scanner stdIn = new Scanner(System.in);
        System.out.print("入力文字：");
        String str = stdIn.next();
        // System.out.print("終了数：");
        // int m = stdIn.nextInt();
        // int sum = 0;
        for (int i = 0; i < str.length; i++)
            // System.out.print();
            // sum+=i;
            System.out.println(i);  
    }
}


