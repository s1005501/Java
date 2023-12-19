package chapter2.recursionAndStackoverflow;

// 堆疊溢出(stack overflow)
// 堆疊溢出常伴隨遞迴一起出現
public class StackOverflow {

    public static void printHi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("開始pirntHi且i等於" + i);
        printHi(i - 1);
        System.out.println("結束pirntHi且i等於" + i);
    }

    public static void main(String[] args) {
        printHi(10);
    }
}