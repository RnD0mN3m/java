package test.java9;

public class java9_3 {
    static void sum(String str, int n) {
     for (int i=0;i<n;i++) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        sum("Hello", 3);
        sum("Good morning", 4);
        sum("Good evening", 2);
    }        
}
