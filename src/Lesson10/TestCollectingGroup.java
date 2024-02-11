package Lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollectingGroup {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        Map<String,List<Employee>> gmap = new HashMap<>();

        gmap = eList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Employees by department");
        gmap.forEach((k,v)->{
            System.out.println("Department: " + k);
            v.forEach(Employee::printSummary);
        });

    }
}
