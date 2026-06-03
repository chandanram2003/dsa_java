// public class Maximum {
//     public static void main(String[] args) {
//         int arr[] = { 34, 50, 60, 35, 87, 98, 32 };
//         int max = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class Maximum {

//     public static void main(String[] args) {
//         int arr[] = { 6, 4, 7, 3, 2, 8, 9 };
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum value is " + max);
//     }
// }

// minimum 
// public class Maximum {

//     public static void main(String[] args) {
//         int arr[] = { 6, 4, 7, 3, 2, 8, 9 };
//         int mix = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < mix) {
//                 mix = arr[i];
//             }
//         }
//         System.out.println("maximum value is " + mix);
//     }
// }

// public class Maximum {
//     public static void main(String[] args) {
//         int arr[] = { 6, 4, 7, 3, 2, 8, 9 };
//         int max = arr[0];
//         int secondlargest = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             } else {
//                 for (int j = 0; j < arr.length; j++) {
//                     if (arr[i]> max ) {
//                         secondlargest = arr[j];
//                     }
//                 }
//             }
//         }
//         System.out.println(secondlargest);
//         System.out.println("maximum value is " + max);
//     }
// }


public class Maximum {
    public static void main(String[] args) {

        int arr[] = {6, 4, 7, 3, 2, 8, 9};

        int max = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
               secondLargest = max;
                max = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Maximum value is " + max);
        System.out.println("Second largest value is " + secondLargest);
    }
}