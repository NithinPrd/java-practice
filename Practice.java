import java.util.*;

class Practice {
    public static void main(String args[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 3);
        map.put(3, 6);
        map.put(4, 4);
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
    }
}