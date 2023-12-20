package chapter2;

// static是一個關鍵字，是用來修飾成員(member，類別的屬性、方法或子類別)，使其成為靜態成員
// 靜態的意思是，在程式載入記憶體的時候，跟著程式一起在記憶體中佔有空間，而不是主程式開始執行後才跟記憶體要空間。
public class StaticJava {

    // 定義method時加上static就可以在psvm裡直接呼叫，如果要使用這種方式的話則全域變數前也要加上static
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 8));
    }
}
