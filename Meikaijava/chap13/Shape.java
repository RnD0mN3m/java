package test.Meikaijava.chap13;

public abstract class StartUp {
    public abstract String toString();
    public abstract void draw();
    public void print() {
        System.out.println(toString());
        draw();
    }
}
public class Point extends StartUp {
    public Point() {

    }
    @Override public String toString() {
        return "Point";
    }
    @Override public void draw() {
        System.out.println("+");
    }
}
public class Shape {
    public static void main(String[] args) {
       
        Point p = new Point();
        p.print();
    }
}