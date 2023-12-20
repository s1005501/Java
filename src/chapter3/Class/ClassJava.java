package chapter3.Class;

// 物件導向
// 在java裡物件有自己獨特的屬性及行為，而以物件的概念來設計的程式就可以稱為物件導向的程式語言
// Class是創造物件的藍圖
// 創建物件的過程被稱作實例化(instantiation)，透過new這個關鍵字來製作出新物件
// 幾乎所有的Class都是參照類型

public class ClassJava {
    public static void main(String[] args) {
        // 在java裡，我們可以建立其他java檔裡的物件
        // 這個Circle是同一層的資料夾裡的那支Circle.java檔
        // Constructor請參考Circle.java
        // 這個new的動作就是會去執行Circle.java的Constructor，不用特別去呼叫
        Circle c1 = new Circle(10);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        c1.radius = 20;
        System.out.println(c1.radius);

        Circle c2 = new Circle(5);
        System.out.println(c2.radius);

        Circle c3 = new Circle();
        // System.out.println(c3.radius);
        System.out.println(c3.getArea());
    }
}
