// 物件導向補充規則2
// 子類class"不會"繼承父類class的"private" method
package chapter3;

class Animal {
    private void hello() {
        System.out.println("hello from Animal");
    }
}

class Dog extends Animal {
    // 這裡如果加@Override compile會報錯，因為根本沒有繼承到該method
    // @Override 
    public void hello() {
        System.out.println("hello from Dog");
    }
}

public class OOPAdditionalTwo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.hello();
    }
}
