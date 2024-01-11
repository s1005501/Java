package chapter5.NestedClass;

// Nested Class
// Nested Class是指在Class內部定義另一個Class(巢狀)。又細分為Non-static(inner class)和static class(static nested class)，差在有沒有加static這個修飾符
// class members(members of a class)指的是class裡的變數、methods
// Nested Class是其Enclosing class(外面的那層class)的一個class member。Non-static nested class(inner class)可以access enclosing class的其他class members，即使它們被宣告為private。Static nested class無權訪問enclosing class的其他class members(因為Static nested class屬於enclosing class本身(共用的)，而不是實例化出來的物件)
// nested class可以宣告為private、public、protected等等

// 實例化的步驟有點不同，格式大概如下
// 注意，如果內層加了static就沒辦法透過下面得方式實例化，可能要單獨拉出來實例化
// 外層Class(Enclosing class)，內層Class(Nested Class)
// 外層Class 外層名稱 = new 外層Class();
// 外層Class.內層Class() 內層名稱 = 外層名稱.new 內層Class

// 使用nested class的原因
// 邏輯分組合理：如果一個class僅對另一個class有用，那麼將其放入該class並將兩者保持在一起是合乎邏輯的
//  封裝：考慮兩個superclass，A 和 B，其中B需要access A 的class member。 通過將class B隱藏在class A中，可以將A的成員declare為private，並且B可以access它們。 此外，B本身可以對外界隱藏
// 使code更具可讀性和維護性：在Class中嵌套inner class使code更接近使用class的位置
public class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printI();
    }
}
