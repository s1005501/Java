package chapter3.modifier;

// 修飾符(modifier)
// 功能是提供class、變數額外的訊息
// 分為訪問及非訪問修飾符。訪問修飾符可以控制訪問的級別，例如public、private。而非訪問修飾符則是提供其他功能，例如abstract、final
// 如果在class宣告時沒有給public、private，java就會幫你套預設，但建議還是請記得都加上
// 在一個class、變數上可以同時加上多個修飾符

// 可在所有method、變數都可以使用的修飾符
// public(訪問):讓code在任何地方都能被使用
// private(訪問):讓code只能在自己的class中使用，從這個class新建立起來的objects也是取不到private的資料的
// protected(訪問):讓code可以在同一個package和subclass中使用
// final(非訪問):讓methods、變數不能被覆蓋/修改。
// static(非訪問):讓methods、變數屬於class本身，而不是從這個class新建立起來的objects

public class Modifier {
    public static void main(String[] args) {
        Circle c = new Circle();

        // 取不到private的資料
        // System.out.println(c.radius);
        System.out.println(c.getRadius());
    }
}
