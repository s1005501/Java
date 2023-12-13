package chapter1;

public class StringOperation {
    public static void main(String[] args) {
        String name = "Kevin";

        // length()可以取得字串的長度
        System.out.println(name.length());

        // toLowerCase()可以將字串轉成全部都是小寫
        System.out.println(name.toLowerCase());

        // toUpperCase()可以將字串轉成全部都是大寫
        System.out.println(name.toUpperCase());

        // java的index規則跟js一樣，但在java裡取索引要透過charAt()，()內放索引
        System.out.println(name.charAt(0));
    }

}
