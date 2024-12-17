package java練習題.入門;

// 4.編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，return type為int[]，返回的值為將array of Integers全部反轉後的新array。

public class Four {
    // 個人解法
    // 先將陣列的長度抓出來/2並無條件捨去小數點(如果長度是奇數最中間不用動，則交換次數也跟偶數相同)來判斷應該對調幾次
    // 透過迴圈去跑剛剛得到的應該對調幾次的次數，迴圈內容則是將陣列索引最開始(i)的跟最尾端(陣列長度先-1後在-i)的做交換
    public static int[] reverseArray(int[] arr) {
        System.out.println(arr.length); // 15
        // 要對調7次, 0/14, 1/13, 2/12, 3/11, 4/10, 5/9, 6/8
        for (int i = 0; i < Math.floor(arr.length / 2); i++) {
            System.out.print("頭" + arr[i]);
            System.out.print("尾" + arr[(arr.length - 1) - i]);
            System.out.println("");

            int temp;
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = { 4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334 };
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.println(i);
        }
    }
}
