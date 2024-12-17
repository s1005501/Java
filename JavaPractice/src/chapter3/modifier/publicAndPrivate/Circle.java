package chapter3.modifier.publicAndPrivate;

// public(訪問):讓code在任何地方都能被使用
// private(訪問):讓code只能在自己的class中使用，從這個class新建立起來的objects也是取不到private的資料的
public class Circle {

    // 實務上變數大多都會設成是private，method則都會設成public
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    // 但仍然會有例外，例如把method設成private的情況是該method只在那個class裡使用
    public double getArea() {
        printFormula();
        return Math.PI * Math.pow(radius, 2);
    }

    private void printFormula() {
        System.out.println("圓面積方程式是pi * r平方");
    }
}
