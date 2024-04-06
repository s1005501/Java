package chapter2.reference;

public class StringCopyByValue {

    // 須注意String雖然是non-primitive data type，但他的運作邏輯卻是copy by value
    // 這是因為在Java中的String其實是char array(字元陣列串成字串)，但包裝成String這種資料類型。為了方便我們使用，才會做成copy
    // by value，但本質上還是non-primitive data type
    public static void stringCopyByValue(String x) {
        x += "World!";
    }

    public static void main(String[] args) {
        String y = "Hello ";
        stringCopyByValue(y);

        System.out.println(y); // Hello
    }
}
