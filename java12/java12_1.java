package test.java12;

import java.util.Scanner;

class Calculator {
    int x;
    int y;
    Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int CalcSum() {
        return this.x + this.y; 
    }
    double CalcAve() {
        return (this.x + this.y)/2;
    }
}

class MoreCalc extends Calculator {
    MoreCalc(int x, int y) {
        super(x, y);
    }
    double CalcPow() {
        return Math.pow(this.x,this.y);
    }
}

class java12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();
        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();
        MoreCalc moreCalc = new MoreCalc(num1, num2);
        int    sum     = moreCalc.CalcSum();
        double average = moreCalc.CalcAve();
        double power   = moreCalc.CalcPow();

        System.out.printf("Sum %d and %d = %d%n",       num1, num2, sum);
        System.out.printf("Average %d and %d = %.0f%n", num1, num2, average);
        System.out.printf("Power %d of %d = %.0f%n",    num1, num2, power);
    }
}
