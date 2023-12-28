package chapter3.modifier;

// static(非訪問):讓methods、變數屬於class本身，而不是從這個class新建立起來的objects
public class StaticModifier {
    public static final int I = 1;
    public int j = 2;

    public static void main(String[] args) {
        System.out.println(I); // 1
        System.out.println(j); // 沒加static直接print會噴

    }
}
