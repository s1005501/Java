package chapter2.recursionAndStackoverflow;

// 正確用法是在遞迴裡加上條件式、判斷式
public class Recursion {

    public static void printHi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("hi");
        printHi(i - 1);
    }

    public static void main(String[] args) {
        printHi(10);
    }
}
