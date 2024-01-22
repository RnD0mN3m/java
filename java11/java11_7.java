package test.java11;

class Student {
    // クラス変数としての 名前 と 番数 と 国語 と 数学 と 英語
    static String name;
    static String number;
    static double jap;
    static double math;
    static double eng;

    // コンストラクタ
    public Student(String name, String number, double jap, double math, double eng) {
        this.name = name; this.number = number; this.jap = jap;
        this.math = math; this.eng = eng;
    }

    String getName() {
        return name;
    }
    String getNumber() {
        return number;
    }
    double getJap() {
        return jap;
    }
    double getMath() {
        return math;
    }
    double getEng() {
        return eng;
    }

    // 合計値を求めるメソッド
    static double Total() {
        return jap+math+eng;
    }

    // 平均値を求めるメソッド
    static double Average() {
        return (jap+math+eng)/3;
    }
}

class java11_7 {
    public static void main(String[] args) {        
        System.out.println("test");
        Student eisann = new Student("A さん","001",89,65,88);
        Student biisann = new Student("B さん","002",80,95,64);
        // Student siisann = new Student("C さん","003",70,80,98);
        System.out.println(eisann.getName());
        // System.out.println(biisann.getName());
        // System.out.println(siisann.getName());
        
        
        // // 平均値を求める
        // double aaa = eisann.Average();
        // double bbb = biisann.Average();
        // double ccc = siisann.Average();
        // // 結果を表示
        // System.out.printf(eisann.getNumber() +" "+ eisann.getName() + "平均点%.2f\n",aaa);
        // System.out.printf(biisann.getNumber() +" "+ biisann.getName() + "平均点%.2f\n",bbb);
        // System.out.printf(siisann.getNumber() +" "+ siisann.getName() + "平均点%.2f\n",ccc);
    }
}
