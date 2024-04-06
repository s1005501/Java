package chapter5.客製化JavaDoc文件;
// Java Doc有特定的寫法

// 輸入/**+enter就會跑出撰寫文件的預設格式，不同地方的預設文件個都不同，文件敘述內容統一寫在*處

// 輸出成javadoc的方式在VSC找不太到，待補

/**
 * 製作Person class的doc
 * Person需要的參數是String name、String homeland
 */

public class Person {
    private String name;
    private String homeland;

    /**
     * constructor需要String name、String homeland來實例化Person
     * 
     * @param name     person name
     * @param homeland person homeland
     */
    public Person(String name, String homeland) {
        this.name = name;
        this.homeland = homeland;
    }

    /**
     * name的getter method
     * 
     * @return String, Person的name
     */
    public String getName() {
        return this.name;
    }
}
