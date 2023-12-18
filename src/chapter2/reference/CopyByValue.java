package chapter2.reference;

// copy by value
// 在java裡如果我們將java裡的primitive當成是實際帶入的參數(actual paramater)，java會自動幫你做copy by value
// 所謂的copy by value的運作邏輯是當我們宣告變數a=10時，java會將這個a=10儲存在記憶體裡，而當我們將a這個primitive當成是實際帶入的參數代進method時，java就會幫我們進行copy by value的動作，即複製a的值給x，並將x=10一樣儲存在記憶體裡，但跟a不同位置，而當我們執行method時，被複製的x就會被改寫成20，被修改的就是x的記憶體，所以a是不變的
// 
public class CopyByValue {
    public static void changeA(int x) {
        x = 20;
    }

    public static void main(String[] args) {
        int a = 10;
        changeA(a); // 10 or 20 ?
        System.out.println(a); // 10

    }
}
