package test.java1;
import java.util.Scanner;
public class java1_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("年：");
        String str = stdIn.next();
        System.out.print("月：");
        String num = stdIn.next();
        System.out.print("日：");
        String qwe = stdIn.next();
        System.out.print(str+"/"+num+"/"+qwe);
    }
}