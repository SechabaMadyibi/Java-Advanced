package Lesson8;

import java.util.List;
import java.util.function.Predicate;

public class RoboCallTest07 {
    public static void main(String[] args) {
        List<Person> p1  = Person.createShortList();
        RoboCall05 robo =new RoboCall05();

        System.out.println("\n===calling all drivers lambda===");

        Predicate <Person> allPilots = p-> p.getAge() >= 23 && p.getAge() <=65;

        p1.stream()
                .filter(allPilots)
                .forEach(p-> robo.roboCall(p));
    }
}
