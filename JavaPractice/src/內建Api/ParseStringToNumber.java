package 內建Api;

public class ParseStringToNumber {
    public static void main(String[] args) {
        // parseInt()功能是把字串轉換成整數，透過Integer呼叫，()內的值放的是要被轉換的String
        String str = "25";
        System.out.println(Integer.parseInt(str)); // 25，這裡的25就不是字串而是數字了

        // 如果字串是小數點，則要透過parseInt()、parseFloat()，才能將字串轉換成小數點，使用方式跟parseInt差不多
        String doubleStr = "9.99";
        System.out.println(Double.parseDouble(doubleStr));

        String floatString = "9.99";
        System.out.println(Float.parseFloat(floatString));
    }
}
