import java.util.HashMap;

public class HashMapTest {
    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,3,4,5,1,5,6,2,3,5};
        for(int i: arr) {
            map.put(i, map.containsKey(i) ? map.get(i)+1 : 1);
        }
        System.out.println(map.toString());
    }
}