package chapter3.modifier.abstractModifier;

public class Cat extends Animal {
    
    public Cat() {
        super("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("喵喵喵~");
    }
}
