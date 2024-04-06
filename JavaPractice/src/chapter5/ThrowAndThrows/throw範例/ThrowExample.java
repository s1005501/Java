package chapter5.ThrowAndThrows.throw範例;

// Throw
// 簡單來說就是我們可以自製例外(exception)並透過throw將其拋出，拋出的例外同樣要在try/catch裡做處理
// 有throw才有catch
// 實際使用時，throw出去的會是一個new Exception物件，而要加new的原因是因為exception本身是一個class，要將其拋出就要透過new將其實例化並執行constructor
// 可以自訂義丟出來的錯誤訊息，使用方法、參數會隨著exception的不同而有差異，實際用到時請再去看文件

public interface ThrowExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        try {
            c1.setRadius(-5);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
