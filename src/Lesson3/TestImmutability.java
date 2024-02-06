package Lesson3;

public class TestImmutability {
    public static void main(String[] args) {
        Employee emp = new Employee(121,"Ron","123abc",5000);

        emp.changeName("sechaba");
        System.out.println(emp);
    }

}
