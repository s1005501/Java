package chapter3.Class;

// 建構函式(Constructor)
// Class裡的建構函式，用於定義物件屬性並設置屬性的初始值
// Constructor必須要跟Class同名
// Constructor用於製作新物件
// Constructor沒有return值
//  
public class Circle {

    // 設置物件的屬性，寫在Constructor上面
    // 加上public表示在所有地方都可以拿到radius這個變數的值
    public double radius;

    // 如果改成private的話，在ClassJava就沒辦法拿到radius的值了，因為radius變成是私有的
    // 絕大多數的情況下，都是設成private
    // private double radius;

    // 同一個檔案裡可以有多個同名的constructor(方法過載method overloading)
    // 這樣的寫法是給預設值的概念
    public Circle() {
        radius = 1;
    }

    // 這個就是Circle Class的Constructor
    // 注意裡面不能加任何的return type
    public Circle(double newRadius) {
        // System.out.println("Hello from circle.java");
        this.radius = newRadius;
    }

    // 物件的行為
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
