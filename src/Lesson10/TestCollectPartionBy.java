package Lesson10;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class TestCollectPartionBy {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        Map<Boolean, List<Employee>> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.partitioningBy(e -> e.getRole().equals(Role.EXECUTIVE)));

        gMap.forEach(((k,v)->
        {
            System.out.println("\nGroup: " +k);
            v.forEach(Employee::printSummary);
        }));
    }
}
