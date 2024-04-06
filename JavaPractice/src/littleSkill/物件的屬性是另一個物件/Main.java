package littleSkill.物件的屬性是另一個物件;

// 實務上有可能某物件的屬性會是另一個物件(看起來像遞迴但不是)，實例化時就要透過getter、setter的方式來設定
public class Main {
    public static void main(String[] args) {
        Person kevin = new Person("Kevin", 30);
        Person dory = new Person("Dory", 30);
        kevin.setSpouse(dory);
        kevin.talk();
    }

}