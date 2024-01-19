package test.java11;

class Calculation {
    // クラス変数としての x と y
    static int x;
    static int y;

    // 合計値を求めるメソッド
    static int Sum() {
        int sum = 0;
        // x から y までの合計を計算
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}

class java11_2 {
    public static void main(String[] args) {
        // 変数 x と y に値を代入
        Calculation.x = 100;
        Calculation.y = 200;

        // 合計値を求める
        int sum = Calculation.Sum();

        // 結果を表示
        System.out.println(Calculation.x + " から " + Calculation.y + " までの合計値は " + sum + " です。");
    }
}


