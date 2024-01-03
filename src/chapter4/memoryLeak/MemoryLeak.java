package chapter4.memoryLeak;

// 內存洩漏(Memory Leak)
// 內存洩漏(Memory Leak)簡單來說就是當物件的參照變更時，原本物件指向的記憶體已經沒有人在使用了，但卻沒有釋放出來，還是佔著記憶體位置
// 如何解決Memory Leak的問題?
// 在java的JVM裡有一支名為Garbage Collector(GC)的程式，會去檢查物件是不是有沒有指向它的參照。它會自動去收集回收並釋放記憶體，簡單來說就是我們可以不用管它
// Memory Leak在其他程式語言(C++)裡就必須要主動的去解決
public class MemoryLeak {
    public static void main(String[] args) {
        Person p1 = new Person("Kevin", 30);
        Person p2 = new Person("Eric", 30);

        // 這個時候p1就會指向p2的參照，原本p1的物件就會變成沒人指向它而造成Memory Leak
        p1 = p2;

        p1.talk();
        p2.talk();
    }
}
