package chapter3;
// 在java裡，package有點類似資料夾的概念

// 如果java檔放在src裡在下一、幾層的資料夾中，就要在該支java檔最上方下package這個關鍵字，後面空一格接資料夾名稱，如果不只一層就用.號連接下一層的資料夾
// 以下方結構示意圖為例，如果我們要讓java3.java能執行，就要在java3.java檔案的最上面加上package file2.fil3

// 結構示意圖
// |-- src
//   |-- file1
//     |-- java1.java
//   |-- file2
//     |-- java2.java
//     |-- file3
//       |-- java3.java

// 如果java檔就放在src下一層的資料夾，就不用用到package

public class Package {
    public static void main(String[] args) {

    }
}
