package littleSkill;

public class StringSplitAndSubstring {

    public static void main(String[] args) {
        String s = "Hello, how are you doing today?";
        // split()的功能是切割字串成陣列，()內給的是遇到哪個字元時要切字串，()內的條件可以是正規表達式的格式
        String[] arr = s.split(" ");
        for (String i : arr) {
            System.out.println(i);
        }

        // substring()的功能是裁掉字串，方法過載api，回傳值是字串
        // 一個參數
        // ()內只給一個參數，參數值是數字，參數表示的是要保留的字串起始值得索引，也就是說如果(3)就是只保留索引3-字串結尾的資料
        String s2 = "Hello";
        s2 = s2.substring(4);
        System.out.println(s2); // o

        // 兩個參數
        // ()內給兩個參數，參數值是數字，第一個參數是要保留的字串起始值得索引，第二個參數是要排除的字串起始值得索引，也就是說如果(0,5)就是只保留索引0-4的資料
        String s3 = "Hello";
        s3 = s3.substring(0, 4);
        System.out.println(s3); // Hell

    }
}
