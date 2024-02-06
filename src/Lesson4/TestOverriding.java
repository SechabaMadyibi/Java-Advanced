package Lesson4;

public class TestOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee(3, "Tom", "122abb", 5000);
        Manager manager =new Manager(3, "Larry","aa23",8000,"Finance");

        System.out.println(emp.getAllDetails());
        System.out.println(manager.getAllDetails());
    }
}
