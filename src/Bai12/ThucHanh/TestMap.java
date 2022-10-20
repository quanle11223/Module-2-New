package Bai12.ThucHanh;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("aaa", 11);
        linkedhashmap.put("aaa1", 21);
        linkedhashmap.put("aaa2", 12);
        linkedhashmap.put("aaa3", 13);

        System.out.println("HashMap");
        System.out.println("\nThe age for " + "Lewis is " + linkedhashmap.get("aaa3"));


    }
}
