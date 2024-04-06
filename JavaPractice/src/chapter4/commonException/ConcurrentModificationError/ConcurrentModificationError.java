package chapter4.commonException.ConcurrentModificationError;

import java.util.ArrayList;

// ConcurrentModification Error
// ConcurrentModification Error是指，當一個object在不允許的情況下嘗試被"同時修改"時，會發生的錯誤情況
// 以範例來說明的話就是，當陣列在跑迴圈時，我們又去做更動移除陣列資料的時候就會造成有兩個程序同時在對一個物件做修改，java是不允許這種狀況發生的，但是這在js裡是合法的
// 而要解決這種情況最簡單的方式是透過額外的變數來儲存要做修改的資訊
// Exception in thread "main" java.util.ConcurrentModificationException
public class ConcurrentModificationError {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(i);
        }

        // // 直接改會噴錯
        // for (int k : arr) {
        // if (k == 10) {
        // arr.remove(k);
        // }
        // }

        // 正確的寫法
        // 這裡要賦值給fix的原因是因為，在跑下面的迴圈的時候，java不確定會不會有符合條件的狀況發生，而且跑完迴圈後又馬上要使用到fix，所以java會要求先賦值給fix，才不會出錯
        int fix = 0;
        for (int k : arr) {
            if (k == 10) {
                fix = k;
            }
        }
        System.out.println(fix);
        arr.remove(fix);
    }

}
