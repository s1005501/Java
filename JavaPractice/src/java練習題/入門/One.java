package java練習題.入門;

import java.util.ArrayList;

// 1.編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。

public class One {
    // 個人解法
    public static ArrayList<Integer> printEvery3(int num) {
        ArrayList<Integer> every3Arr = new ArrayList<>();
        int number = 1;
        every3Arr.add(number);

        for (int i = 0; i < num; i++) {
            number += 3;
            every3Arr.add(number);
        }

        System.out.println(every3Arr);
        return every3Arr;
    }

    public static void main(String[] args) {
        printEvery3(29);
    }
}
