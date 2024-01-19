package test.java8;

import java.util.*;

public class java8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10個の整数を入力
        int[] inputArray = getInputArray(scanner);

        // 偶数値の配列を取得
        int[] evenArray = getFilteredArray(inputArray, true);

        // 奇数値の配列を取得
        int[] oddArray = getFilteredArray(inputArray, false);

        // 結果を表示
        printArray("偶数値配列", evenArray);
        printArray("奇数値配列", oddArray);
    }

    // ユーザーから10個の整数を入力して配列を返すメソッド
    private static int[] getInputArray(Scanner scanner) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " 件目：整数を入力 = ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // 指定された条件に基づいて配列をフィルタリングして返すメソッド
    private static int[] getFilteredArray(int[] array, boolean isEven) {
        int count = countFiltered(array, isEven);
        int[] filteredArray = new int[count];

        int index = 0;
        for (int num : array) {
            if ((num % 2 == 0) == isEven) {
                filteredArray[index++] = num;
            }
        }

        return filteredArray;
    }

    // 指定された条件に合致する要素の数を数えるメソッド
    private static int countFiltered(int[] array, boolean isEven) {
        int count = 0;
        for (int num : array) {
            if ((num % 2 == 0) == isEven) {
                count++;
            }
        }
        return count;
    }

    // 配列を表示するメソッド
    private static void printArray(String label, int[] array) {
        System.out.print(label + " = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
