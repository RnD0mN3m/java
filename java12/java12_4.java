package test.java12;

class Animal {
    protected String name, eat; //, z
    Animal()      { this.name = null; }
    Animal(String name) {this.name = name; }
    // Person(String z) {this.z = z; }
    void introduce() {System.out.print(name + "は、"); }
    void eat(String foob) { System.out.print(name + "は、" + foob + "を食べました。"); }
}
class Dog extends Animal {
    int length; //, z
    Dog(String name, int length) {super(name); this.length = length; }
    @Override void introduce() { super.introduce(); System.out.println(length + "メートル走りました。"); }
}
class Bird extends Animal {
    int length; //, z
    Bird(String name, int length) {super(name); this.length = length; }
    @Override void introduce() { super.introduce(); System.out.println(length + "メートル飛びました。"); }
}
class Whale extends Animal {
    int length; //, z
    Whale(String name, int length) {super(name); this.length = length; }
    @Override void introduce() { super.introduce(); System.out.println(length + " キロメートル泳ぎました。"); }
}
class java12_4 {
    public static void main(String[] args) {
        Dog dog = new Dog("犬", 10);
        dog.introduce();
        dog.eat("お肉");
        System.out.println();
        Bird bird = new Bird("鳥", 1000);
        bird.introduce();
        bird.eat("虫");
        System.out.println();
        Whale whale = new Whale("鯨", 50);
        whale.introduce();
        whale.eat("オキアミ");
    }
} 
