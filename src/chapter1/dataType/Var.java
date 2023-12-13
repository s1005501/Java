package chapter1.dataType;

public class Var {
    public static void main(String[] args) {
        // var可以用於所有的資料型態，但是在使用var上有兩個限制，一是不能用在fields上。 二是不能在沒有初始值的變數上使用(也就是宣告不賦值)
        var x = 5;
        // var y // 這樣不行會噴錯
    }
}
