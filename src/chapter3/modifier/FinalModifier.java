package chapter3.modifier;

// final(非訪問):讓methods、變數不能被覆蓋/修改
public class FinalModifier {
    public static final double PI = 3.14;
    public static double radius = 1.0;

    public static void main(String[] args) {
        PI = 6.28; // 會噴錯
        radius = 2.0; // 一般變數就可以直接做修改
    }

}
