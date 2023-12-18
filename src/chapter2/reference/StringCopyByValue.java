package chapter2.reference;

public class StringCopyByValue {

    // 須注意String雖然
    public static void stringCopyByValue(String x) {
        x += "World!";
    }

    public static void main(String[] args) {
        StringCopyByValue s = new StringCopyByValue();

        String y = "Hello ";
        stringCopyByValue(y);

        System.out.println(y);
    }
}
