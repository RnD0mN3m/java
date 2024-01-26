package test.java13.java13_3;

class java13_3 {
    public static void main(String[] args) {
        Person[] p = {
            new Teacher("竹井一馬", "教員", "情報処理"),
            new Cook("大原太郎", "シェフ", "オムライス")
        };
        for (Person k : p) {
            k.name();
            k.jog();
            k.other();
            System.out.println();
        }
    }
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

