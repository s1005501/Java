package chapter5.例外處理;

// IndexOutOfBoundsException
// 用index access一個array，index超過array的長度限制的話，會產生IndexOutOfBoundsException
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[4]);
    }
}
