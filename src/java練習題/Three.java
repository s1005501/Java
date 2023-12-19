package java練習題;

public class Three {
    // 3.編寫一個名為"findMax()”的函數，參數為一個array of Integers，return
    // type為int，返回的值為array當中所有元素當中，最大的那個。

    public static int findMax(int[] arr) {
        // 宣告變數不賦值就做判斷式、迴圈會出現以下編譯錯誤
        // The local variable max may not have been initializedJava
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // api寫法
            // max = Math.max(arr[i], arr[i + 1]);

            // 判斷式寫法
            if (arr[i + 1] > arr[i]) {
                max = arr[i + 1];
            } else {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = { 4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334 };
        System.out.println(findMax(array));
    }
}
