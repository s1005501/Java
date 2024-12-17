package chapter3;

// 變數作用域(Scope)
// 在Java裡變數的有效範圍被稱為scope
public class Scope {

    // 如果要讓變數在全域都能生效要設成全域變數
    private int i;

    public void setVariable() {
        i = 10;

        // j變數只在setVariable裡生效
        int j = 666;
    }

    public void accessVariable() {
        System.out.println(i);

        // accessVariable是沒有辦法拿到j變數的值的，執行會報錯
        // System.out.println(j);
    }

    public static void main(String[] args) {
        Scope s = new Scope();
        s.setVariable();
        s.accessVariable();
    }
}
