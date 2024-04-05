package chapter5.例外處理;

import javax.swing.JOptionPane;

// 例外處理(Exception handling)
// 在Java裡，有些東西不是bug，但它們會在我們的程式中造成麻煩。 例如，在JOptionPane.showInputDialog()中，我們要求用戶輸入數字。之後，我們使用Integer.parseInt(n)將JOptionPane.showInputDialog()中的字符串類型轉換為int。如果用戶是一個只輸入數字的好人，那我們的程式運作不會有問題。但如果用戶輸入一個字符串怎麼辦？我們的程序無法將『我今年十歲』的String類型轉換為數字。這就是所謂的Exception

// 在實務上要處理exception是透過try/catch
// 有可能引發例外的程式放在try的{}內，處理例外的程式放在catch的{}，並可以給其一個變數(型態是各種exception物件，變數名稱慣例上會叫e)，catch可以一直串下去(js的不行)，最後finally的{}放的是無論有沒有例外發生都會被執行的程式
// finally是可寫可不寫的，但try catch一定要同時出現

// try{
//     有可能引發例外的程式
// }catch(例外種類1 變數1){
//     處理例外1的程式
// }catch(例外種類2 變數2){
//     處理例外2的程式
// }finally{
//     無論有沒有例外發生，finally內部的code都會被執行
// }

public class ExceptionHandling {

    int age;
    String ageString;

    public ExceptionHandling() {
        ageString = JOptionPane.showInputDialog("你的年齡是?");
        try {
            age = Integer.parseInt(ageString);
            if (age <= 18) {
                System.out.println("不能開車");
            } else {
                System.out.println("可以開車");
            }
        } catch (NumberFormatException e) {
            System.out.println("輸入的資料格式母丟喔!");

            // 實務上常在catch裡用變數呼叫printStackTrace()來追蹤錯誤
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // constructor也可以直接執行，透過new constructor()
        new ExceptionHandling();

    }
}
