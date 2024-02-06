package Lesson4;

public class testEqualsTo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "sechaba", "as11", 5000);
        Employee emp2 = new Employee(1, "sechaba", "as11", 5000);
        System.out.println(emp1.equals(emp2));
        emp2 = emp1;
        System.out.println(emp1.equals(emp2));
    }

}
