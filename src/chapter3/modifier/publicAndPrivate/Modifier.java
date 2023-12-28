package chapter3.modifier.publicAndPrivate;

// 修飾符(modifier)
// 功能是提供class、變數額外的訊息
// 分為訪問及非訪問修飾符。訪問修飾符可以控制訪問的級別，例如public、private。而非訪問修飾符則是提供其他功能，例如abstract、final
// 如果在class宣告時沒有給public、private，java就會幫你套預設，但建議還是請記得都加上
// 在一個class、變數上可以同時加上多個修飾符

// 可在所有method、變數都可以使用的修飾符
// public(訪問)、private(訪問)、protected(訪問)、final(非訪問)、static(非訪問)
public class Modifier {
    public static void main(String[] args) {
        Circle c = new Circle(10);

        // 取不到private的資料
        // System.out.println(c.radius);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}
