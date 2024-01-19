// package test.java8;

// public class java8_1 {
//     static int[] idxArray(int n) {
//         int[] a=new int[10];
//         for (int i=0;i<10;i++)
//         a[i]=i;
//         return a;
//     }
//     public static void main(String[] args) {
//         int[] x =idxArray(10);
//         for (int i= 0;i<=10;i++)
//         System.out.println("list["+i+"]="+ x[i]);
//     }
// }


package test.java8;

public class java8_1 {
    static int[] idxArray(int n) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i+1;
        return a;
    }

    public static void main(String[] args) {
        int[] x = idxArray(10);
        for (int i = 0; i < 10; i++)
            System.out.println("list[" + i + "]=" + x[i]);
    }
}
