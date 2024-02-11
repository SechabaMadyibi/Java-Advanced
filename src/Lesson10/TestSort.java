package Lesson10;

import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("Total CO bonus");

         eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .sorted()
                .forEach(d-> System.out.printf("Total bonus paid: $%,6.2f %n  ", d));

    }
}
