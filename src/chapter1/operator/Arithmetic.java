package chapter1.operator;

public class Arithmetic {
    public static void main(String[] args) {
        // 常用的算術運算
        // number + number = 數字相加
        System.out.println(5 + 5); // 10

        // string + string = 字串串接
        System.out.println("5" + "5"); // 55

        // number + string = 數字串接字串輸出字串
        System.out.println(5 + "10"); // 510

        // number * number = 數字相乘
        System.out.println(5 * 5); // 25

        // number * string = 不能這樣使用會噴錯(在JS裡會顯示NaN)
        // System.out.println(5 * "5"); // 25

        // 整數除整數會回傳無條件捨去小數點的整數結果
        // int / int = 無條件捨去小數點的整數
        System.out.println(9 / 10); // 0

        // 如果想要避免上面的情況發生，其中一個值就要改用浮點數去做運算
        // float / int = 可以含小數點的運算結果
        System.out.println(9.0 / 10); // 0.9

        // 在java裡做算術運算的話不像在js一樣會自動幫你判斷轉型態
        // 15+15=30=>30+"15"="3015"=>"3015"+15+15=>"30151515"
        System.out.println(15 + 15 + "15" + 15 + 15); // 30151515

        // 判斷資料型態
        // (要判斷的資料).getClass().getClass()可以判斷資料的型態
        // 回傳的值前兩段是判斷資料的class類別，最後一段則是其資料型態
        System.out.println((5 + "10").getClass().getName()); // java.lang.String

    }
}
