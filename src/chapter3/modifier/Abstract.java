package chapter3.modifier;

// 抽象類(abstract)
// 用來表示這個class是一個受限的class，不能用來創建object(instantiate)，主要的功能是讓其他class來繼承他(ex:抽象概念的繼承，動物(animal)概念相對於實際存在的動物狗、貓等)
// 使用時直接加在class前即可，只能在method裡做使用

// abstract method
// abstract class裡特殊的method，只有定義但不執行，在java裡規定所有繼承abstract class的子類都要去override abstract method
// abstract class可以混用abstract method、非abstract method
public class Abstract {
    public static void main(String[] args) {

    }
}
