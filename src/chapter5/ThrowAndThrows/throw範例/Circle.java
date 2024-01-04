package chapter5.ThrowAndThrows.throw範例;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("半徑不能是負的!");
        } else {
            this.radius = radius;
        }
    }
}
