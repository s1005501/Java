package chapter1.dataType;

public class Int {
    public static void main(StringAndChar[] args) {
        // 設定變數x的data type是integer(整數)，即宣告時就會確定該變數的型態
        // int表示值必須是整數，能存32bits的資料，也就說值介於在-2的31次方~2的31次方-1之間
        int x = 5;
        x += 1; // x=x+1 語法糖

        int y = 10;
        System.out.println(x + y);

        // long的值也是整數，跟int差在long能存64bits的資料，也就說值介於在-2的63次方~2的63次方-1之間，因此值較大時要使用long
        long z = 5555;
    }
}
