package littleSkill;

public class ToStringOverride {
    private int x;
    private int y;

    public ToStringOverride(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 如果用一般物件呼叫內建的toString拿到的值是class名稱@記憶體位置
    // 透過@Override覆寫客製化自己的toString功能
    @Override
    public String toString() {
        return "x是" + x + ", y是" + y;
    }

    public static void main(String[] args) {
        ToStringOverride t = new ToStringOverride(5, 10);

        // 未override toString
        // System.out.println(t.toString()); // ToString@279f2327
        // System.out.println(t.getClass().getName()); // ToString

        // override toString
        // 直接印object就會自動執行override的method
        System.out.println(t); // x是5, y是10
    }
}
