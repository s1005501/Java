package chapter5.方法鏈;

// 方法鏈(Method Chaining)
// 方法鏈是物件導向的程式語言中常見的設計。即每一個method回傳一個object，讓我們可以再接著使用class內的其他功能(物件.methodA().methodB().methodC())
// 注意，method要回傳物件，因此method return的形態要記得改
// 如果method改的是自己本身的話可以直接return this

public class MethodChaining {
    public static void main(String[] args) {
        Person p = new Person();
        // 原本寫法
        // p.setName("Kevin");
        // p.setAge(30);
        // p.setMajor("Social Science");
        // p.setGpa(6.66);

        // 方法鏈寫法
        p.setName("Kevin").setAge(30).setMajor("Social Science").setGpa(6.66);
    }
}
