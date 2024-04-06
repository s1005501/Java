package chapter2;

// mod運算子
// 就是兩整數相除取餘數，mod運算子符號是%
public class ModOperator {
    public static void main(String[] args) {
        System.out.println(10 % 3); // 1

        // 常用於判斷整數是奇數還是偶數
        int a = 666;
        if (a % 2 == 0) {
            System.out.println("a是偶數");
        } else {
            System.out.println("a是奇數");
        }
    }
}
