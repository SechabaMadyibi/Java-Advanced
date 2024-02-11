package Lesson10;

import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("\nSorting surname ");

        eList.stream()

                .sorted(Comparator.comparing(Employee::getSurName))
                .forEach(Employee::printSummary);

        System.out.println("\nSorting surname reversed");

        eList.stream()

                .sorted(Comparator.comparing(Employee::getSurName).reversed())
                .forEach(Employee::printSummary);

        System.out.println("\nSorting Department reversed");

        eList.stream()

                .sorted(Comparator.comparing(Employee::getDept).reversed())
                .forEach(Employee::printSummary);

    }
}
