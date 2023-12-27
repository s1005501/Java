package chapter3.modifier;

// class的修飾符
// 訪問
// 代表這個class可被其他class訪問，ex:public、private

// 非訪問
// abstract，代表這個class是一個受限的class，不能用來創建object，他主要的功能是讓其他class來繼承他
// 使用時直接加在class前即可
// public abstract class class名稱{}
public class Circle {

    // 實務上變數大多都會設成是private，method則都會設成public
    // 但仍然會有例外，例如會把method設成private的情況是該method只在那個class裡使用
    private double radius = 1.0;

    public double getRadius() {
        return this.radius;
    }
}
