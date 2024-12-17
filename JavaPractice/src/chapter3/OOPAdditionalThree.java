// 物件導向補充規則3
// 在Override method的時候，訪問修飾符(access modifier)只能維持或變大，不能縮小
package chapter3;

class Animal {
    protected void hello() {
        System.out.println("hello from Animal");
    }
}

class Dog extends Animal {
    // 父類的訪問修飾符(access modifier)是protected，子類就只能維持protected或放大成public
    // 縮小成private會報錯!
    @Override
    private void hello() {
        System.out.println("hello from Dog");
    }
}

public class OOPAdditionalThree {
    public static void main(String[] args) {
        
    }
}
