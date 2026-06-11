import java.util.*;

class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of element:");
        int n1 = sc.nextInt();
        System.out.println("enter array:");
        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 17, 12, 20, 5, 4 };

        for (int i = 0; i < arr.length; i++) {
            boolean isLadder = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLadder = false;
                    break;
                }

            }
          
            if (isLadder) {
                System.out.print("ladder"+arr[i]);
            }

        }
    }
}