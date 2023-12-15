package chapter1.loop;

public class NestedLoop {
    public static void main(String[] args) {
        // 巢狀迴圈(nested loop)
        // 即在迴圈內部再放置迴圈的情況即可稱巢狀迴圈
        // 注意!迴圈裡的宣告的變數不可以取相同名稱，因為作用域的關係會互相干擾

        for (int i = 0; i < 10; i++) {
            for (int j = 3; j > 0; j--) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
