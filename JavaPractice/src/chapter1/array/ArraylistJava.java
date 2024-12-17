package chapter1.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {

    public static void main(String[] args) {
        // Arraylist是一個可調整大小的陣列，使用前要先將其從java.util.ArrayList匯入(import)
        // import java.util.ArrayList;

        // 基本的java ArrayList
        // ArrayList<型態> 變數名稱 = new ArrayList<>();
        ArrayList<String> friends = new ArrayList<>();

        // 須注意，ArrayList後面的<>不能放primitive type(ex: int, double)，會噴錯
        // 如果要放primitive type的話，要將primitive typ轉成non-primitive type(應該?，ex: int =>
        // Integer)
        ArrayList<Integer> numbers = new ArrayList<>();

        // ArrayList的api
        // add()，將資料新增進ArrayList裡，要新增的資料放在()內
        friends.add("Kevin");
        friends.add("Eric");
        friends.add("Mike");
        friends.add("Hank");

        // size()，查看ArrayList的長度
        System.out.println(friends.size()); // 4

        // ArrayList是可以直接sout印出來查看的
        System.out.println(friends); // [Kevin, Eric, Mike, Hank]

        // get()，取得ArrayList裡的資料，()內放的是資料的索引
        System.out.println(friends.get(3)); // Hank

        // Collections.sort()，功能是將ArrayList裡的資料按Collections的規則做排序，()內放的是ArrayList
        // 使用時要先將其從import java.util.Collections匯入(import)
        Collections.sort(friends);
        System.out.println(friends); // [Eric, Hank, Kevin, Mike]

        // clear()，將ArrayList裡的資料清空
        friends.clear();

        // 不同型態的ArrayList的寫法，一樣可以用，不知道加不加<>差在那，有可能是舊的寫法(因為公司的寫法是第一種)，建議還是按照上方正規的寫法比較好(?)
        ArrayList arrListTypeOne = new ArrayList<>();
        ArrayList arrListTypeTwo = new ArrayList();
    }
}
