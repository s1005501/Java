package chapter1.dataType;

public class Double {
    public static void main(StringAndChar[] args) {
        // double
        // double表示值是浮點數，能存64bits的資料，因此精度較float高，java預設浮點數是double
        // 實務在使用上會將constants名稱改成大寫，如果變數名稱較長則會以底線(_)隔開，增加可讀性
        final double PI = 3.14;
        final double TEST_VARIABLE = 0.5555;

        // final
        // PI前已經加上final就不可再做更改了，會噴錯
        // PI = 666;

        // float
        // float表示值同樣是浮點數，能存32bits的資料，java預設浮點數是double，如果還是要使用float就要在值後面加上F才行，不然會噴錯
        float floatNumber = 0.3F;

    }

}
