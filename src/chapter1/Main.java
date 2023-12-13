package chapter1;

import chapter1.dataType.StringAndChar;

public class Main {
    // 輸入jsvm可快速生成public static void main(String[] args){}
    public static void main(StringAndChar[] args) {
        // 輸入sout可快速生成System.out.println()
        System.out.println("Hello World");

        // 輸出的資料也可以是簡單的表達式
        System.out.println(4 + 6);
        System.out.println(4.0 / 3);
    }
}
