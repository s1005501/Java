package chapter5.短路求值;

// 短路求值(Short-circuit evaluation)
// 用法跟js一樣
// Short-circuit evaluation是一種對if statement的性能的優化，透過AND(&&)和OR(||)運算符來做判斷，格式如下
// true && false // false
// false && true // false

// true || false // true
// false || true // true

// java好像不會自動轉型別，求值的部分好像就沒那麼好用
public class ShortCircuit {
    public static void main(String[] args) {
        double n1 = 10.0;
        int n2 = 0;
        boolean b = false;

        if (b || n1 / n2 != 3) {
            System.out.println("false");
        }
    }
}
