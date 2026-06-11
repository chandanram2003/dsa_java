import java.util.Scanner;

public class Longestconsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Anter array");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                continue;
            }

            maxLen = arr[i];
        }
        System.out.println(maxLen);

    }
}
