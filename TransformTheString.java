import java.util.*;

class TransformTheString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++) {
            String s = sc.nextLine();
            String f = sc.nextLine();
            boolean[] arr = returnValidArray(f);
            int val = getMinimumCombinations(s, arr);
            System.out.println("Case #"+(i+1)+": "+val);
        }
        sc.close();
    }

    public static boolean[] returnValidArray(String f) {
        boolean[] arr = new boolean[26];
        char[] cArr = f.toCharArray();
        for(Character c: cArr) {
            arr[c-97] = true;
        }
        return arr;
    }

    public static int getMinimumCombinations(String s, boolean[] arr) {
        char[] a = s.toCharArray();
        int i, j, total = 0, initial;
        for(Character c: a) {
            initial = c-97;
            for(i=initial, j=initial; i>=0 || j<26;) {
                if(arr[i]) {
                    total += initial-i;
                    break;
                } else if(arr[j]) {
                    total += j-initial;
                    break;
                }
                if(i>=0) i--;
                if(j<26) j++;
            }
        }
        return total;
    }
}