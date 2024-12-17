package java練習題.入門;

// 5.編寫一個名為"addUpTo()”的函數，參數為一個整數n，return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n的值。

public class Five {
    // 個人解法
    // n = 5，1 + 2 + 3 + 4 + 5 =>15
    public static int addUpTo(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(100));
        System.out.println(addUpTo(1000));
        System.out.println(addUpTo(10000));
    }
}
