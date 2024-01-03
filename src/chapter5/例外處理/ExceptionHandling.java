package chapter5.例外處理;

import javax.swing.JOptionPane;

// 例外處理(Exception handling)
// 在Java裡，有些東西不是bug，但它們會在我們的程式中造成麻煩。 例如，在JOptionPane.showInputDialog()中，我們要求用戶輸入數字。之後，我們使用Integer.parseInt(n)將JOptionPane.showInputDialog()中的字符串類型轉換為int。如果用戶是一個只輸入數字的好人，那我們的程式運作不會有問題。但如果用戶輸入一個字符串怎麼辦？我們的程序無法將『我今年十歲』的String類型轉換為數字。這就是所謂的Exception
// 在實務上要處理exception是透過try/catch

public class ExceptionHandling {

    int age;
    String ageString;

    public ExceptionHandling() {
        ageString = JOptionPane.showInputDialog("你的年齡是?");
        age = Integer.parseInt(ageString);
        System.out.println(ageString);
        System.out.println(age);

        if (age <= 18) {
            System.out.println("不能開車");
        } else {
            System.out.println("可以開車");
        }
    }

    public static void main(String[] args) {
        // constructor也可以直接執行，透過new constructor()
        new ExceptionHandling();

    }
}
