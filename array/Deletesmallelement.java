import java.util.*;

public class Deletesmallelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smaller = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smaller) {
                smaller = arr[i];
                index = i;
            }
        }

        System.out.println("Removed element: " + smaller);

        System.out.print("Array after removing smallest element: ");
        for (int i = 0; i < n; i++) {
            if (i != index) {
                System.out.print(arr[i] + " ");
            }
        }    }
}