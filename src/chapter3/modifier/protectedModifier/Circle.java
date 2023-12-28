package chapter3.modifier.protectedModifier;

// protected(訪問):讓code可以在同一個package和subclass中使用
public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}
