package test.java12;

// class Person {
//     protected String x, y; //, z
//     Person()      { this.x = null; }
//     Person(String x, String y) {this.x = x; this.y = y; }
//     // Person(String z) {this.z = z; }
//     void introduce() {System.out.println("氏名：" + x); System.out.println("職業：" + y);}
// }
// class Teacher extends Person {
//     String x, y; //, z
//     Teacher(String x1, String y1, String x2) {super.x = x1; super.y = y1; this.x = x2; }
//     void introduce() { super.introduce(); System.out.println("担当科目：" + x); }
// }
// class Cook extends Person {
//     String x, y; //, z
//     Cook(String x1, String y1, String x2) {super.x = x1; super.y = y1; this.x = x2; }
//     void introduce() { super.introduce(); System.out.println("得意料理：" + x); }
// }
// class java12_2 {
//     public static void main(String[] args) {
//         Teacher a = new Teacher("近藤勇", "教員", "Go 言語");
//         a.introduce();
//         System.out.println();
//         Cook b = new Cook("沖田総司", "シェフ", "オムライス");
//         b.introduce();
//         System.out.println();
//     }
// }
class Person {
    private static int counter = 0;
    private int id;
    
    public int getId() {
        return id;
    }
    protected String a, b, c; //, z
    Person() { this.a = null; id = ++counter;}
    Person(String x, String y) {this.a = a; this.b = b; this.c = c; }
    // Person(String z) {this.z = z; }
    void introduce() {System.out.println("書　　名：" + a); System.out.println("著 者 名：" + b); System.out.println("出 版 年：" + c); }
}
class Teacher extends Person {
    String x, y; //, z
    Teacher(String a1, String b1, String c1) {super.a = a1; super.b = b1; super.c = c1; }
    void introduce() { super.introduce(); }
}
class java12_2 {
    public static void main(String[] args) {
        Teacher a = new Teacher("三国志", "吉川英治", "1989");
        a.introduce();
        System.out.print("書籍番号：" + a.getId());
        System.out.println();
        Teacher b = new Teacher("楊令伝","北方謙三","2011");
        b.introduce();
        System.out.print("書籍番号：" + b.getId());
        System.out.println();
        Teacher c = new Teacher("竜馬がゆく","司馬遼太郎","1998");
        c.introduce();
        System.out.print("書籍番号：" + c.getId());
        System.out.println();
        Teacher d = new Teacher("竜馬がゆく","司馬遼太郎","1998");
        d.introduce();
        System.out.print("書籍番号：" + d.getId());
        System.out.println();
        Teacher e = new Teacher("吾輩は猫である","夏目漱石","1905");
        e.introduce();
        System.out.print("書籍番号：" + e.getId());
        System.out.println();
    }
}
// // 氏名： 
// // 職業： 
// // ("近藤勇", "教員", "Go 言語")