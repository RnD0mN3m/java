package test.java7;

public class java7_4 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
    
        // 合計が100,000を超えるまで繰り返す
        while (sum <= 100000) {
            sum += i;
            i++;
        }
    
        // 結果を表示
        System.out.println("合計が 100000 を超える n は " + (i - 1) + " です");
    }
}
    

