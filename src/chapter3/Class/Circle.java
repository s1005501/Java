package chapter3.Class;

// 建構函式(Constructor)
// Class裡的建構函式，用於定義物件屬性並設置屬性的初始值
// Constructor必須要跟Class同名
// Constructor用於製作新物件
// Constructor沒有return值
// 所有Class都默認有Constructor，如果我們不寫Constructor，Java會為我們自動創建一個，但我們就無法為物件屬性設置初始值
public class Circle {

    // 設置物件的屬性，寫在Constructor上面
    // 加上public表示在這支java裡的所有地方都可以拿到radius這個變數的值
    public double radius;

    // 如果改成private的話，在ClassJava就沒辦法拿到radius的值了，因為radius變成是私有的
    // 絕大多數的情況下，都是設成private
    // private double radius;

    // 這個就是Circle Class的Constructor
    // 注意裡面不能加任何的return type
    public Circle(double newRadius) {
        System.out.println("Hello from circle.java");

        radius = newRadius;
    }
}
