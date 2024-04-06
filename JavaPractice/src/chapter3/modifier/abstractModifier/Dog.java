package chapter3.modifier.abstractModifier;

public class Dog extends Animal {
    public Dog() {
        super("dog");
    }

    @Override
    public void makeSound() {
        System.out.println("旺旺旺!");
    }

}
