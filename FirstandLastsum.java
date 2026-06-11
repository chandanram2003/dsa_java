import java.util.*;

public class FirstandLastsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int difference = arr[0] - arr[n - 1];
        System.out.println("diffrence is " +difference);

    }
}