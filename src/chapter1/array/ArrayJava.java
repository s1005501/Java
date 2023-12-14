package chapter1.array;

public class ArrayJava {
    public static void main(String[] args) {
        // 在java裡可以去定義陣列的放的資料型態
        // 使用方式是在型態後面加上中括號[]，值要用大括號{}包起來，{}內放陣列資料，值與值之間以逗號(,)隔開
        // 型態[] 變數名稱 = {值1, 值2, ...}
        String[] friends = { "Kevin", "Eric", "Mike", "Hank" };

        // 陣列取值是用[]號
        System.out.println(friends[1]);

        // 陣列抓長度直接用length屬性就可以了，不用呼叫length() api
        System.out.println(friends[friends.length - 1]);

        // 創造一個新的、空的陣列
        String[] newFriends = new String[5];
    }
}
