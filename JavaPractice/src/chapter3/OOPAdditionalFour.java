// 物件導向補充規則4
// 在Override method的時候，如果method有return值，則子類可return的資料除了父類的return type外，也包含該return type的所有子類物件
package chapter3;

class Animal {
    public void speaking() {
        System.out.println("Animal is speaking...");
    }
}

class Dog extends Animal {
    @Override
    public void speaking() {
        System.out.println("Dog is speaking...");
    }
}

class Zoo {
    public Animal getOneAnimal() {
        return new Animal();
    }
}

// Zoo class return Animal class，Animal class的子類有Dog
// class，而DogZoo繼承自Zoo，因此當DogZoo去Override getOneAnimal的時候，其return值就可以是Animal的子類Dog
class DogZoo extends Zoo {
    @Override
    public Dog getOneAnimal() {
        return new Dog();
    }
}

public class OOPAdditionalFour {}
