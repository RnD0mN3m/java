package test.java12;

class Animal {
    protected String name; //, z
    Animal()      { this.name = null; }
    Animal(String name) {this.name = name; }
    // Person(String z) {this.z = z; }
    void introduce() {System.out.print(name + "は、");}
}
class Dog extends Animal {
    int length; //, z
    Dog(String name, int length) {super.name = name; this.length = length; }
    @Override void introduce() { super.introduce(); System.out.print(length + "メートル走りました。"); }
}
class Bird extends Animal {
    int length; //, z
    Bird(String name, int length) {super.name = name; this.length = length; }
    @Override void introduce() { super.introduce(); System.out.print(length + "メートル飛びました。"); }
}
class Whale extends Animal {
    int length; //, z
    Whale(String name, int length) {super.name = name; this.length = length; }
    @Override void introduce() { super.introduce(); System.out.print(length + " キロメートル泳ぎました。"); }
}
class java12_3 {
    public static void main(String[] args) {
        Dog dog = new Dog("犬", 10);
        dog.introduce();
        System.out.println();
        Bird bird = new Bird("鳥", 1000);
        bird.introduce();
        System.out.println();
        Whale whale = new Whale("鯨", 50);
        whale.introduce();
        System.out.println();
    }
}

 

