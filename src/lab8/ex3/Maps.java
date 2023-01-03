package lab8.ex3;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();

    }

    public static boolean contains(Map<Integer, Integer> map, int value) {
        return map.containsValue(value);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            if (map.get(key) == value) {
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {

        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {

        return map.values();
    }

    public static String getColor(int value) {

        if (value == 0) {
            return "black";
        } else if (value == 1) {
            return "white";
        } else {
            return "red";
        }


    }


    public static void main(String args[]) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1, 0);
        hashMap.put(2, 1);
        hashMap.put(3, 3);
        hashMap.put(4, 2);
        hashMap.put(5, 0);
        System.out.println("Size of the hash map: " + count(hashMap));
        System.out.println(hashMap);
        System.out.println(keySet(hashMap));

        System.out.println("Contains :" + containsKeyValue(hashMap, 1, 0));
    }

}
