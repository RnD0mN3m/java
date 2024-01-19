package test.java11;

class Calculate {
    // インスタンス変数としての x と y
    int x;
    int y;

    // コンストラクタ
    public Calculate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 合計値を求めるメソッド
    int Sum() {
        int sum = 0;
        // x から y までの合計を計算
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}

class java11_3 {
    public static void main(String[] args) {
        // 変数 x と y に値を代入
        int x = 100;
        int y = 200;

        // 演算実行クラスのインスタンスを作成
        Calculate calculator = new Calculate(x, y);

        // 合計値を求める
        int sum = calculator.Sum();

        // 結果を表示
        System.out.println(x + " から " + y + " までの合計値は " + sum + " です。");
    }
}

