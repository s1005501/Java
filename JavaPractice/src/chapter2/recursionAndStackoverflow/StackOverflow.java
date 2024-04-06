package chapter2.recursionAndStackoverflow;

// 堆疊溢出(stack overflow)
// 堆疊溢出常伴隨遞迴一起出現

// 以以下範例來說就是，printHi(10)執行，印”開始”，printHi(9)執行，印”開始”...，這時候堆疊就已經發生，而當i=0時return，就開始執行之前堆置未執行的印”結束”的程式碼(由容器的上方開始移除往下執行，因此會是從1開始往10印回去，開始10印到開始1，再從結束1印到結束10，堆疊溢出?)
public class StackOverflow {

    public static void printHi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("開始printHi且i等於" + i);
        printHi(i - 1);
        System.out.println("結束printHi且i等於" + i);
    }

    public static void main(String[] args) {
        printHi(10);
    }
}