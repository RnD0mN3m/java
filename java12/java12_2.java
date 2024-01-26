package test.java12;

abstract class Person {
    public String name, job; //, z
    Person()      { this.name = null; }
    Person(String name, String job) {this.name = name; this.job = job; }
    // Person(String z) {this.z = z; }
    void introduce() {System.out.println("氏名：" + name); System.out.println("職業：" + job);}
}
class Teacher extends Person {
    String subject; //, z
    Teacher(String name, String job, String subject) {super(name,job); this.subject = subject; }
    void introduce() { super.introduce(); System.out.println("担当科目：" + subject); }
}
class Cook extends Person {
    String specialities; //, z
    Cook(String name, String job, String specialities) {super(name,job); this.specialities = specialities; }
    void introduce() { super.introduce(); System.out.println("得意料理：" + specialities); }
}
class java12_2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("近藤勇", "教員", "Go 言語");
        teacher.introduce();
        System.out.println();
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        cook.introduce();
    }
}
// 氏名： 
// 職業： 
