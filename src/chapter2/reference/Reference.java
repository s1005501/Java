package chapter2.reference;

// 參照(reference data type、non-primitive data type)
public class Reference {

    public static void changeFirstElement(int[] arr) {
        // arr拿到的參照會跟帶進來的實際參數一樣，因此當arr有做更改，也會一併影響到帶進來的實際參數
        arr[0] = 1000;
    }

    public static void main(String[] args) {
        // primitive data type的賦值底層概念就是copy by value
        // int a = 10;
        // int b = a;
        // a = 30;
        // System.out.println(a + ", " + b); // 30, 10

        // non-primitive
        // 參照概念跟js一樣
        int[] myArr1 = { 10, 20, 30 };
        int[] myArr2 = myArr1; // copy by reference
        myArr1[0] = 100;

        // 100 20 30
        for (int i : myArr1) {
            System.out.print(i + "");
        }

        System.out.println();

        // 100 20 30
        for (int i : myArr2) {
            System.out.print(i + "");
        }

        // 參照類型的資料當成真的帶入method的參數(actual paramater)時，java運作的規則就是copy by reference
        // 1000 30 50
        int[] myArr3 = { 10, 30, 50 };
        changeFirstElement(myArr3);
        for (int i : myArr3) {
            System.out.print(i + "");
        }

    }
}
