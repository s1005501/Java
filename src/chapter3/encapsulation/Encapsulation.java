package chapter3.encapsulation;

// 封裝(Encapsulation)
// 封裝的定義是將code和它操作的數據綁定在一起的機制。是一種保護屏障，可防止數據被該屏蔽之外的code訪問或是隨意更改
// 達到封裝的手段是將變數盡可能的設定成private，以及若是要從外部更改或是存取data，就要使用setter和getter methods(react的useState的感覺)
public interface Encapsulation {
    public static void main(String[] args) {
        // // 未封裝
        // Robot r = new Robot("Buzz Lightyear", 1995);
        // r.yearMade = -500;
        // System.out.println(r.name + " is made at " + r.yearMade);

        // 封裝
        Robot r = new Robot("Buzz Lightyear", 1995);
        r.setName("Woody");
        r.setYearMade(2024);
        System.out.println(r.getName() + " is made at " + r.getYearMade());

    }
}
