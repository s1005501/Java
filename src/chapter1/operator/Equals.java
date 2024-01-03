package chapter1.operator;

public class Equals {
    public static void main(String[] args) {
        // ==適用於primitive data type的資料之間的比較
        System.out.println(5 == 3); // false

        // .equals()適用於non-primitive data type的資料之間的比較
        int[] a = { 1, 2, 3 };
        int[] b;
        b = a;
        System.out.println(a.equals(b)); // true
    }
}
