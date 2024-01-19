package test.java8;

public class java8_2 {
    public static void main(String[] args) {
        String[] kanto = {"茨城", "栃木", "群馬", "千葉", "東京", "埼玉", "神奈川"};
         for (String prefecture : kanto) {
                System.out.println(prefecture+"県");
        }
    }        
}

