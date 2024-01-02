package chapter3.Interface;

public class Chicken extends Animal implements Edible {
    public Chicken() {
        super("chicken");
    }

    @Override
    public String howToEat() {
        return "炸雞好ㄘ";
    }

    @Override
    public void makeSound() {
        System.out.println("咕咕咕~");
    }

}
