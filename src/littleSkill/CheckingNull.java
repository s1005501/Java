package littleSkill;

public class CheckingNull {
    // null只能使用!=、==來做比較，不能透過equals()，會噴錯
    public static void main(String[] args) {
        String checkingNull = null;

        System.out.println(checkingNull);

        if (checkingNull == null) {
            System.out.println("checkingNull == null"); // checkingNull == null
        }
        if (checkingNull.equals(null)) {
            System.out.println("checkingNull equals null");
        }

    }
}
