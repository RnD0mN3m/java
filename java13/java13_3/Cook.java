package test.java13.java13_3;

class Cook implements Person {
    String name, job, specialities;
    Cook(String name, String job, String specialities) { this.name = name; this.job = job; this.specialities = specialities; }
    @Override
    public void name() {System.out.println("氏名：" + name); }
    @Override
    public void jog() { System.out.println("職業：" + job); }
    @Override
    public void other() { System.out.println("得意料理：" + specialities); }
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

