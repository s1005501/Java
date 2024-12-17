package chapter3;

// static是一個關鍵字，主要是用來做內存管理
// 其可以將class裡變數、method變成靜態的，靜態的意思是，在程式載入記憶體的時候，跟著程式一起在記憶體中佔有空間，而不是主程式開始執行後才跟記憶體要空間
// 簡單來說就是static可以讓變數、method屬於class本身，變成共享的資料，而不是隨著constructor被呼叫就重複的建立，以節省記憶體。因此使用static變數、method時不用先建立物件，而是可以直接呼叫使用(在psvm裡)
// 主要用在class裡值是固定且常被其他物件、method使用的變數

public class StaticJava {

    private double radius;
    private static final double PI = 3.14;

    public StaticJava() {
        this(1.0);
    }

    public StaticJava(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return StaticJava.PI * Math.pow(this.radius, 2);
    }

    // 在static method(包含psvm)裡要執行的method也一定要是static method
    public static void main(String[] args) {
        StaticJava s = new StaticJava(10);
        System.out.println(s.getArea());

        // 新建立的class還是可以拿的到static的值，但要注意值是private還是public
        System.out.println(s.PI);

        // 以下才是實務上的寫法
        System.out.println(StaticJava.PI);
    }
}
