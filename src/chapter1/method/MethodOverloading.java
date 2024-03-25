package chapter1.method;

// Method Overloading 方法多載
// 在java裡我們透過method的簽名(signature)來辨識method，因此簽名具有唯一性，而簽名是由名稱(name)+參數(parameter type)所組成
// 而方法多載指的是在java裡我們可以使用具有相同名稱但參數不同的method(因為他們的簽名不同因此不會被認為是同一個method)
public class MethodOverloading {
    public void MethodOverloading() {

    }

    // 下面兩個method名稱相同但參數不同，因此簽名也不同，所以可以使用方法多載
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void addition(String a, String b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        MethodOverloading m = new MethodOverloading();

        m.addition(5, 6); // 11
        m.addition("Hello", " World"); // Hello World
    }
}
