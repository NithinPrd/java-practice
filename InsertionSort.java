import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers to be sorted: ");
        int count = sc.nextInt();
        System.out.println("Enter the numbers as per index: ");
        int[] arr = new int[count];
        for(int i = 0; i<count; i++) {
            System.out.print((i+1) + " - ");
            arr[i] = sc.nextInt();
        }
        sortArray(arr, count);
        System.out.println("\nThe sorted array is: ");
        for(int i = 0; i<count; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        sc.close();
    }

    public static void sortArray(int[] arr, int count) {
        int j = 0, x = arr[0];
        for(int i=1; i<arr.length; i++) {
            x = arr[i];
            j = i;
            while(j>0 && arr[j-1]>x) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = x;
        }
    }
}
