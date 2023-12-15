package chapter1.array;

public class ArrayJava {
    public static void main(String[] args) {

        // 在java裡可以去定義陣列裡的放的資料的型態
        // 使用方式是在型態後面加上中括號[]，值要用大括號{}包起來，{}內放陣列資料，值與值之間以逗號(,)隔開
        // 型態[] 變數名稱 = {值1, 值2, ...}
        String[] friends = { "Kevin", "Eric", "Mike", "Hank" }; // 表示陣列裡的資料都是字串

        // 陣列取值是用中括號[]
        System.out.println(friends[1]);

        // 陣列抓長度直接用length屬性就可以了，不用呼叫length() api
        System.out.println(friends[friends.length - 1]);

        // 可以透過new 型態[陣列長度]的方式創造一個新的、空的陣列
        // 型態[] 變數名稱 = new 型態[陣列長度]
        String[] newFriends = new String[5];

        // 把資料塞進空陣列、更新陣列的值的方式是透過[]和索引來附值，找不到的空值則會以null顯示
        // 變數[索引值] = 要塞進陣列的資料
        newFriends[0] = "凱文";
        System.out.println(newFriends[0]); // 凱文
        newFriends[0] = "艾瑞克";
        System.out.println(newFriends[0]); // 艾瑞克
        System.out.println(newFriends[1]); // null

        // 直接透過sout印陣列出來的話會顯示類以以下的資料
        // [Ljava.lang.String;@279f2327
        // @16進位的數字表示的是該資料在記憶體裡的位置
        System.out.println(friends);

        // Array的大小不能修改（如果要向Array中添加或刪減總元素數量，則必須創建一個新數組）
        friends[4] = "Wilson";

        // Array裡可以再放Array進去，大概格式如下，要幾層Array就要加上對應得[]
        // 型態[][] 變數名稱 = new 型態[第一層Array能放的數量][第二層Array能放的數量]
        int[][] my2DArray = new int[4][3];
        my2DArray[2][1] = 10;

    }
}
