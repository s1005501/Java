package chapter5.ThrowAndThrows.throws範例;

// Throws
// 用來表示method會throw出來的exception type，使用情況是當我們不想透過try/catch來處理exception就可以使用throws，實際用起來感覺沒啥作用
// 實際用法是把throws exception的型態加在method的變數()後面，格式如下:
// public void method名稱(變數) throws exception型態{}
public class ThrowsExample {
    public static void main(String[] args) {
        System.out.println(10 / 0);
    }
}
