package chapter3.encapsulation;

public class Robot {

    // // 未封裝
    // // 將變數設為public可能導致外部的code可以隨意變更class裡的資料
    // public String name;
    // public int yearMade;

    // public Robot(String name, int yearMade) {
    // this.name = name;
    // this.yearMade = yearMade;
    // }

    // 封裝
    private String name;
    private int yearMade;

    public Robot(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    // setter method，通常會用void
    public void setName(String name) {
        this.name = name;
    }

    public void setYearMade(int yearMade) {
        if (yearMade < 1990) {
            System.out.println("YearMade can't be earlier than 1990");
        } else if (yearMade > 2023) {
            System.out.println("YearMade not yet come");
        } else {
            this.yearMade = yearMade;
        }
        ;
    }

    // getter method
    public String getName() {
        return this.name;
    }

    public int getYearMade() {
        return this.yearMade;
    }

}
