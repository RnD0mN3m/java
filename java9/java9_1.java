package test.java9;

import java.util.Scanner;

public class java9_1 {
    static void num(String gakkou, String name) {
        System.out.println("学校名："+gakkou);
        System.out.println("名前："+name);
    }
    
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        String gakkou=stdIn.next();
        String name=stdIn.next();
        num(gakkou,name);
    }        
    

}