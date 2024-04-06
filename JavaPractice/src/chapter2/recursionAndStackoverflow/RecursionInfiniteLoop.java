package chapter2.recursionAndStackoverflow;

// 遞迴(recursion)
// 就是自己呼叫自己
public class RecursionInfiniteLoop {
    // 這樣寫會無限迴圈
    public static void printHi() {
        System.out.println("hi");
        printHi();
    }

    public static void main(String[] args) {
        printHi();
    }
}
