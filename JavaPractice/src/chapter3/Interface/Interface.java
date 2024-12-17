package chapter3.Interface;

// 接口(interface)
// 一種使用abstract class的方式，實際使用時要將class替換成interface
// public interface class名稱{}

// 特性
// 內部所有的method"默認"都是abstract method，因此在定義時不需要特別寫"abstract"

// 同樣不能實例化(創建object)

// 子類繼承時要override"所有"的method(因為默認都是abstract method)

// 其內部的屬性都預設是public、static、final

// 一個class可以implement多個Interface，但只能繼承一個class，使用方式是在被繼承的父類後面再加上implements interface名稱，interface以逗號隔開可以一值串下去
// public 子類名稱 extends 父類名稱 implements interfaceA,interfaceB{}

// 如果有個class implement了一個Interface ，那麼該class的所有object都是該Interface的一個object，舉例來說，A extends B implements C,D,E，那在A裡，可以這樣寫A(B,C,D,E) object = new Object，但這樣會有個問題就是用interface、父class創建的物件無法使用其他繼承、implement的資料，所以建議還是使用子class來創建物件()

// Interface不能包含constructor

// 可以作為一種data type，用來做Polymorphism
public class Interface {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken.howToEat());
        chicken.makeSound();
    }
}
