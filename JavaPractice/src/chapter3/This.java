package chapter3;

// this
// 簡單來說就是指向自己
public class This {

    private double radius;

    // 實務上給預設的寫法
    public This() {
        // 直接呼叫this()，()在給預設值
        // 這個this就是執行下面的constructor
        this(1.0);
    }

    // 實務上的constructor的寫法
    // 通常會將區域變數的名稱取的跟全域變數一樣
    public This(double radius) {
        // this寫法，透過this指向自己，拿到全域變數，再將區域變數賦值給他，也就是說第一個是全域變數，第二個是區域變數(可以透過編譯器協助判斷，看變數名稱的顏色)
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public static void main(String[] args) {
        This t = new This(10);
        System.out.println(t.getArea());

    }
}