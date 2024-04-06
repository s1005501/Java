package chapter1.loop;

public class WhileLoop {
    public static void main(String[] args) {
        // while迴圈
        // while迴圈是一個控制流語句，它根據給定的boolean條件重複執行Java程式當中的某一部分
        // while (條件式) {
        // 迴圈內容;
        // }

        // 迴圈要執行的次數未知時應該用while迴圈

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

    }
}
