package java練習題.入門;

// 6.編寫一個名為“position()”的函數，input為String。函數沒有任何return type，但需要打印出第一個大寫字母及其index位置。如果未找到，則打印-1。

public class Six {
    // 個人解法
    public static void position(String str) {
        // 透過split把字串變成陣列
        String[] strArr = str.split("");
        
        // 宣告count變數去記錄沒有比對到大寫的數量
        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            // 將字元轉變成大寫
            String upper = strArr[i].toUpperCase();

            // 比對原字串資料是否有大寫，有則print，沒有則count++
            if (strArr[i].equals(upper)) {
                System.out.println(strArr[i] + " " + i);
                return;
            } else {
                count++;
            }
        }

        // 如果count數量跟陣列長度一樣表示沒有比對到大寫，print-1
        if (count == strArr.length) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        position("abcd"); // prints -1
        position("AbcD"); // prints A 0
        position("abCD"); // prints C 2
    }
}
