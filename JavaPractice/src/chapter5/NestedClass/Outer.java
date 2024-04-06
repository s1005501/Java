package chapter5.NestedClass;

public class Outer {
    // class members
    private int i = 0;

    private void printHello() {
        System.out.println("Hello");
    }

    // 加了static就沒辦法訪問Outer的其他class members
    class Inner {
        void printI() {
            System.out.println(i);
            printHello();
        }
    }
}
