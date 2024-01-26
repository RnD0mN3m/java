入力された文字数は 5 です。package test.java13.java13_3;

class Teacher implements Person {
    String name, job, subject;
    Teacher(String name, String job, String subject) { this.name = name; this.job = job; this.subject = subject; }
    @Override
    public void name() { System.out.println("氏名：" + name); }
    @Override
    public void jog () { System.out.println("職業：" + job); }
    @Override
    public void other() { System.out.println("担当科目：" + subject); }
}




//      //, z
//     Person()      { this.name = null; }
//     Person(String name, String job) { }
//     // Person(String z) {this.z = z; }
    // abstract void introduce(); // { }

// 
//     String ; //, z
//     
//     
// 
// 
//     String  //, z
//     
//     
//
// 
// 

