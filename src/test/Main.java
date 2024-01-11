package test;

public class Main {
    public String str = "str";

    public static class Test {
        public String test = "test";

        public void printStr() {
            Main m = new Main();
            System.out.println(m.str);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        // System.out.println(m.str);
        t.printStr();
    }
}
