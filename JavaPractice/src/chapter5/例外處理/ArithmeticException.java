package chapter5.例外處理;

// ArithmeticException
// 任何數除上零會導致ArithmeticException
// Exception in thread "main" java.lang.ArithmeticException: / by zero
public class ArithmeticException {
    public static void main(String[] args) {
        System.out.println(10 / 0);
    }
}
