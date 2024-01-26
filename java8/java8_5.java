package test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java8_5 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    
    int sum = 0;
    for (int i = 0; i < array.size(); i++) {
        sum += array.get(i);
    }
    System.out.println("合計値は"+sum+"です。");
    System.out.println("平均値は"+((double)sum/array.size())+"です。");
    }
    
}
