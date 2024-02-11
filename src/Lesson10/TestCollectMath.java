package Lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollectMath {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        double averageSalary = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName))
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("average salary");
        System.out.printf("Average: $%,9.2f %n",averageSalary);
    }
}
