package Lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("s001", "Blue Polo Shirt");
        partList.put("s002", "Black Polo Shirt");
        partList.put("h001", "Duke Hat");

        partList.put("s002", "Black T Shirt");
        System.out.println(partList);
        Set<String > keys  = partList.keySet();

        for (String k: keys)
        {
            System.out.println(partList.get(k));

        }

    }
}
