import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the number of integers");
        int count = Integer.parseInt(sc.nextLine());
        int arr[] = new int[count];
        System.out.println("Enter the integer");
        int max = 0, counter=1;
        for(int i=0; i<count; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=1; i<=max; i++) {
            if(i%2==0 || i%3==0 || i%5==0) {
                map.put(i, counter++);
            }
        }
        Integer val;
        for(int i=0; i<count; i++) {
            val = map.get(arr[i]);
            System.out.println(val==null ? 0 : val);
        }
        sc.close();
    }
}
