package chapter3.modifier.abstractModifier;

// 抽象類(abstract)
// 用來表示這個class是一個受限的class，不能用來創建object(instantiate)，主要的功能是讓其他class來繼承他(ex:抽象概念的繼承，動物(animal)概念相對於實際存在的動物狗、貓等)
// abstract class使用時直接加在class前即可
// public abstract class class名稱{}
// Abstract class可以作為一種data type，用來做Polymorphism
public class Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 這樣會噴錯，因為abstract不能創建object
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal cat1 = new Cat();

        dog1.makeSound();
        cat1.makeSound();
    }
}
