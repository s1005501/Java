package 內建Api;

public class Equals {
    public static void main(String[] args) {
        // ==適用於primitive data type的資料之間的比較
        System.out.println(5 == 3); // false

        // .equals()適用於non-primitive data type的資料之間的比較
        int[] a = { 1, 2, 3 };
        int[] b;
        b = a;
        System.out.println(a.equals(b)); // true

        // 注意，null不能使用equals()，會噴錯
        // 該錯誤常在物件間比較時發生，原因是因為未先確認該物件是否為null值
        // System.out.println(null.equals(null)); 
        
        // 判斷物件是否為null值時要使用==或!=，因為如果物件真的是null的話，是不能呼叫equals()的
        System.out.println(null == null); // true
    }
}
