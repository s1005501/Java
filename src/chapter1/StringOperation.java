package chapter1;

public class StringOperation {
    public static void main(String[] args) {
        String name = "Kevin";

        // length()的功能是取得字串的長度
        System.out.println(name.length()); // 5

        // toLowerCase()的功能是可以將字串轉成全部都是小寫
        System.out.println(name.toLowerCase()); // kevin

        // toUpperCase()的功能是可以將字串轉成全部都是大寫
        System.out.println(name.toUpperCase()); // KEVIN

        // java的index規則跟js一樣
        // 在java裡取索引要透過charAt()，()內放索引
        System.out.println(name.charAt(0)); // K

        // indexOf()可以從字串中判斷是否有我們要找的資料，如果有以該資料的索引值顯示，()內的值就是我們要判斷的條件
        System.out.println(name.indexOf("v")); // 2
        // 如果要判斷的條件是字串，則以字串的第一個字元的索引值呈現
        System.out.println(name.indexOf("in")); // 3

        // 字串轉換成數字
        // Integer.parseInt()功能是把字串轉換成數字，()內的值放的是要被轉換的Sring
        String age = "25";
        System.out.println(Integer.parseInt(age)); // 25，這裡的25就不是字串而是數字了
    }

}
