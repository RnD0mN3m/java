package test.java8;

import java.util.Scanner;

class Sample8_8 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int max, min;

        int[] num = new int[3];
        
        System.out.println("整数値を3つ入力してください。");

        for (int i=0; i < num.length; i++){
            System.out.print((i+1) + "つ目の整数値：");
            num[i] = stdIn.nextInt();
        }

        max = min = num[0];
        for (int i=1; i < num.length; i++){
            if ( max < num[i]){
                max = num[i];
            }
            if (min > num[i]){
                min = num[i];
            }
        }
    
        // 最大値を表示
        System.out.println("最大値：" + max);
        
        // 最小値を表示
        System.out.println("最小値：" + min);
    }
}