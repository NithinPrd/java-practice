import java.util.Scanner;

public class BellNumber {
    private void calculateBellTriangle(int[][] arr, int n) {
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 2;
        for(int i=2; i<n; i++) {
            arr[i][0] = arr[i-1][i-1];
            for(int j=1; j<=i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i][j-1];
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Bell Triangle: ");
        int l = sc.nextInt();
        int[][] arr = new int[l][l];
        BellNumber instance = new BellNumber();
        instance.calculateBellTriangle(arr, l);
        for(int i=0; i<l; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
