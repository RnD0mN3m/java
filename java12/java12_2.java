package test.java12;

class Person {
    protected String x, y; //, z
    Person()      { this.x = null; }
    Person(String x, String y) {this.x = x; this.y = y; }
    // Person(String z) {this.z = z; }
    void introduce() {System.out.println("氏名：" + x); System.out.println("職業：" + y);}
}
class Teacher extends Person {
    String x, y; //, z
    Teacher(String x1, String y1, String x2) {super.x = x1; super.y = y1; this.x = x2; }
    void introduce() { super.introduce(); System.out.println("担当科目：" + x); }
}
class Cook extends Person {
    String x, y; //, z
    Cook(String x1, String y1, String x2) {super.x = x1; super.y = y1; this.x = x2; }
    void introduce() { super.introduce(); System.out.println("得意料理：" + x); }
}
class java12_2 {
    public static void main(String[] args) {
        Teacher a = new Teacher("近藤勇", "教員", "Go 言語");
        a.introduce();
        System.out.println();
        Cook b = new Cook("沖田総司", "シェフ", "オムライス");
        b.introduce();
        System.out.println();
    }
}
// 氏名： 
// 職業： 
