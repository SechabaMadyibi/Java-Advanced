package Lesson6;

public class TestWidgetPro {
    public static void main(String[] args) {
        WidgetPro wp = new WidgetPro(900, 200, 300L, "Big Widget");

        System.out.println(wp.calcProfit());
        wp.printItemReport();
    }
}
