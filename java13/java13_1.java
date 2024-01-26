package test.java13;

abstract class Person {
    public String name, job;
    Person()      { this.name = null; }
    Person(String name, String job) {this.name = name; this.job = job; }
    abstract void introduce();
}
class Teacher extends Person {
    String subject;
    Teacher(String name, String job, String subject) {super(name,job); this.subject = subject; }
    void introduce() { System.out.println("氏名：" + name); System.out.println("職業：" + job); System.out.println("担当科目：" + subject); }
}
class Cook extends Person {
    String specialities;
    Cook(String name, String job, String specialities) {super(name,job); this.specialities = specialities; }
    void introduce() { System.out.println("氏名：" + name); System.out.println("職業：" + job); System.out.println("得意料理：" + specialities); }
}
class java13_1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        teacher.introduce();
        System.out.println();
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        cook.introduce();
    }
}
