package chapter1.operator;

public class Equals {
    public static void main(String[] args) {
        // ==是用於primitive data type的資料之間的比較
        System.out.println(5 == 3); // false

        // .equal()是用於non-primitive data type的資料之間的比較
        System.out.println("Wilson".equals("Kevin")); // false
    }
}
