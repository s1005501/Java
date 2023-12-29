package chapter3.polymorphism;

class A {
    public void hello() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    // 雖然沒有寫@Override，但這裡也算是Override，Override
    public void hello() {
        System.out.println("Hello from class B");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        // 多型的動態綁定(Dynamic Binding)
        // 這裡的意思是如果父類與子類之間有Override的情況發生，且有使用多型時，則java在執行該同名method時會去執行實例化的method(new出來的那個)
        // 這跟override的概念類似但並不一定相同
        A b = new B(); // Hello from class B
        A a = new A(); // Hello from class A

    }
}
