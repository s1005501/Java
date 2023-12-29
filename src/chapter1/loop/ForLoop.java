package chapter1.loop;

public class ForLoop {
    public static void main(String[] args) {
        // for迴圈
        // for (起始式; 條件式; 步進式) {
        // 迴圈內容;
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // 已知迴圈要執行的次數是多少時應該用for迴圈

        String[] friends = { "Kevin", "Eric", "Mike", "Hank" };

        // for (int i = 0; i < friends.length; i++) {
        // System.out.println(friends[i]);
        // }

        // 常用的for迴圈寫法
        // 印出陣列的值(js的for/of迴圈)
        // for(型態 變數名稱 : 陣列變數){
        // 執行內容
        // }
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
