package java練習題.入門;

// 2.編寫一個名為“ninetable()”的函數，它打印出九九乘法表的內容。

public class Two {
    // 個人解法
    public static void ninetable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void main(String[] args) {
        ninetable();
    }
}
