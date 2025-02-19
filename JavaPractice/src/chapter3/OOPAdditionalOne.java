// 物件導向補充規則1
// 父類創建的class無法呼叫到子類內特有的變數、method，除非透過轉型(type casting)
package chapter3;

class A {
    public void hi() {
        System.out.println("Hi from A");
    }
}

class B extends A {
    public void hello() {
        System.out.println("Hello form B");
    }
}

class C extends A {
    public void hello() {
        System.out.println("Hello form C");
    }
}
public class OOPAdditionalOne {

    public static void main(String[] args) {
        A obj = new B();

        // obj可能是A物件、B物件、C物件
        // obj.hello(); // 會噴錯

        // 轉型就可以呼叫到子類的method
        ((B) obj).hello();

        // 這裡雖然compile沒有報錯，但實際執行會出問題，原因在於obj裡裝的是B物件，它是沒有辦法轉型成C物件的
        // ((C) obj).hello();
        
        // 而要避免這樣的狀況發生，建議在轉型前先透過if/else + instanceof判斷物件之間的關係
        if (obj instanceof C) {
            ((C) obj).hello();
        }
    }
}
