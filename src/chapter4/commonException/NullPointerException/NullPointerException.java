package chapter4.commonException.NullPointerException;

// NullPointerException
// NullPointerException常發生在嘗試訪問尚未instantiation的object上的fields或invoke method時，會發生的錯誤情況
// 簡單來說就是去取、呼叫未實例化的物件裡的屬性(這樣取到的值會是null)時會出現的錯誤，因為實務上有可能某物件的屬性會是另一個物件，就有可能在取值時出錯
// 解決的方式是盡可能透過判斷式過濾掉出錯的可能性
public class NullPointerException {
    public static void main(String[] args) {
        // 物件的屬性是另一個物件的情況是透過setter的方式來解決
        Person kevin = new Person("Kevin", 30);
        Person dory = new Person("Dory", 30);
        kevin.setSpouse(dory);
        dory.setSpouse(kevin);
        kevin.talk();
    }

}