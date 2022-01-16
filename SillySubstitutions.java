import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SillySubstitutions {
    private static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++) {
            int s = Integer.parseInt(sc.nextLine().trim());
            String f = sc.nextLine();
            // List<Integer> arr = returnValidArray(f);
            String val = getMinimumCombinations(s, f);
            System.out.println("Case #"+(i+1)+": "+val);
        }
        sc.close();
    }

    public static List<Integer> returnValidArray(String f) {
        char[] arr = f.toCharArray();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            arr2.add(Integer.parseInt(String.valueOf(arr[i])));
        }
        map.put(01, 2);
        map.put(12, 3);
        map.put(23, 4);
        map.put(34, 5);
        map.put(45, 6);
        map.put(56, 7);
        map.put(67, 8);
        map.put(78, 9);
        map.put(89, 0);
        map.put(90, 1);
        return arr2;
    }

    public static String getMinimumCombinations(int l, String arr) {
        int val;
        String finalVar = "";
        for(int i=0; i<arr.length(); i++) {
            arr = arr.replace("01", "2");
            arr = arr.replace("12", "3");
            arr = arr.replace("23", "4");
            arr = arr.replace("34", "5");
            arr = arr.replace("45", "6");
            arr = arr.replace("56", "7");
            arr = arr.replace("67", "8");
            arr = arr.replace("78", "9");
            arr = arr.replace("89", "0");
            arr = arr.replace("90", "1");
        }
        return arr;
    }
}
