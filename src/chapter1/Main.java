package chapter1;

public class Main {
    // 輸入psvm可快速生成public static void main(String[] args){}
    // public static void main(String[] args) {}會被Java自動執行，且是第一個執行的method
    public static void main(String[] args) {
        // 輸入sout可快速生成System.out.println()
        // println()表示要印出來的資料要整行做顯示
        System.out.println("Hello World");

        // print()表示要印出來的資料不需要一定要整行做顯示，有可能會跟後面的資料接再一起
        System.out.print("Kevin");

        // 輸出的資料也可以是簡單的表達式
        System.out.println(4 + 6);
        System.out.println(4.0 / 3);
    }
}
