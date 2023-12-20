package chapter3;

// this
// 簡單來說就是指向自己
public class This {

    private double radius;

    // 實務上的constructor的寫法
    public This(double radius) {
        // this寫法，透過this指向自己，拿到全域變數，再將區域變數賦值給他
        // 也就是說第一個是全域變數，第二個是區域變數
        this.radius = radius;
    }

public double getArea

    public static void main(String[] args) {
        This t = new This(10);

    }
}
