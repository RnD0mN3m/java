package test.java13.java13_4;

import java.util.Scanner;

public class java13_4 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.println("１個目の整数を入力してください："); 
        String num1 =stdIn.next();
        System.out.println("２個目の整数を入力してください：")3 
        String num2 =stdIn.next();
        CalcExcuter c = new CalcExcuter();
            c.dispAdd();
            c.dispSub();
            c.dispMulti();
            c.dispDiv();
            System.out.println();
        }    
    }
}
以下のクラス図のように、CalcExcuter クラスは 2 つのメソッドを持ったインターフェース、CalcAddSub と
CalcMultiDiv を実装したクラスです。CalcExcuter クラスのインスタンスを生成して、以下の実行例を参考に、
入力された 2 つの数の計算結果を画面に表示するプログラムを作成しなさい。 
【実行例】 

足し算の結果：18 
引き算の結果：12 
掛け算の結果：45 
割り算の結果：5