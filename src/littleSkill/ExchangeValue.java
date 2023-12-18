package littleSkill;

public class ExchangeValue {
    public static void main(String[] args) {
        // 快速交換兩個變數或陣列裡的值
        int a = 5;
        int b = 6;

        // 方法一，透過一個暫時的變數來儲存
        // 宣告一個空的變數temp，功能是用來暫存要做交換的變數的值
        int temp;
        temp = a; // 先將a的值存到temp裡，此時a=5, b=6, temp=5
        a = b; // 在把b的值給a，此時a=6, b=6, temp=5
        b = temp; // 最後再把temp的值給b，a=6, b=5

        // 方法二，透過陣列來儲存要交換的資料的值
        // 宣告一個空的陣列arr，並將a、b都存放進該陣列
        // int[] arr = { a, b };
        // 在透過陣列[索引值]的方式分別賦值給a、b變數以完成值得交換
        // b = arr[0]; 
        // a = arr[1];

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
