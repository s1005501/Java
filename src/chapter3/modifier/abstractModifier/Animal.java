package chapter3.modifier.abstractModifier;

public abstract class Animal {

    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;

    }

    public void sleep() {
        System.out.println("This " + animalType + " is sleeping");
    }

    // abstract method
    // abstract class裡特殊的method，只有定義但不執行，在java裡規定所有繼承abstract class的子類都要去override
    // abstract method
    // abstract class可以混用abstract method、非abstract method
    // 寫成類似以下的格式就可以了，不需要有參數與執行內容
    // public abstract void method名稱();
    public abstract void makeSound();
}
