package Lesson10;

import java.util.List;
import java.util.*;

public class TestAverage {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("Average CO bonus");
        OptionalDouble result2;
        result2 = eList.stream()
                .filter(e-> e.getRole().equals(Role.EXECUTIVE))
                .filter(e-> e.getState().equals("CO"))
                .peek(e-> System.out.println("Name: "+ e.getGivenName() + "Surname: "+ e.getSurName()))
                .mapToDouble(e-> e.getSalary()* Bonus.byRole(e.getRole()))
                .peek(e-> System.out.printf("Bonus: $%,6.2f %n ", e))
                .average();
        System.out.printf("Average bonus paid: $%,6.2f %n  ", result2.getAsDouble());

    }
}
