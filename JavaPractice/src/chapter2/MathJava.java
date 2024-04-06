package chapter2;

// Math物件
// 用於做數學運算的java內建的物件，可以直接使用
public class MathJava {
    public static void main(String[] args) {
        // 常用到的api
        // Math.max()，功能是篩選出多個整數、浮點數裡的最大值，()內放要做篩選的整數、浮點數
        int a = 45;
        int b = 2;
        System.out.println(Math.max(a, b)); // 45

        // Math.floor()，功能是無條件捨去，()內放浮點數
        double c = 3.14;
        System.out.println(Math.floor(c)); // 3.0

        // Math.ceil()，功能是無條件進位，()內放浮點數
        System.out.println(Math.ceil(c)); // 4.0

        // Math.sqrt()，功能是開根號，()內放整數、浮點數，回傳double
        int d = 100;
        System.out.println(Math.sqrt(d)); // 10.0

        // Math.pow()，功能是得出參數的次方，()內有兩個參數，第一個給要做次方的數字，第二個給要乘上的次方數，比如(2,8)就是2的8次方，回傳double
        System.out.println(Math.pow(3, 3)); // 27
    }
}
