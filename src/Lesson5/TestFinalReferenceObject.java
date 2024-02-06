package Lesson5;

public class TestFinalReferenceObject {
    public static void main(String[] args) {

        final Employee emp1 = new Employee(1,"sechaba","122f", 5000);
        Employee emp2 = new Employee(1,"sechaba","122f", 5000);
        emp1.setEmpId(100);
//        emp1 = emp2;

    }

}
