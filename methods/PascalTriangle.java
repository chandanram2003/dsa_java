// import java.util.Scanner;

// public class Pascaltrangle {
//     public static int fact(int n) {
//         int xfact = 1;
//         for (int i = 1; i <= n; i++) {
//             xfact *= i;
//         }
//         return xfact;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 0; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.println(" " + " ");
//             }
//         }
  
//       for (int j = 0; j <= i; j++) {
//                 int icj = fact(i) / (fact(j) * fact(i - j));
//                 System.out.print(icj + " ");
//             }

//             System.out.println();
//         }

    
// }


import java.util.Scanner;

public class PascalTriangle {

    public static int fact(int n) {
        int xfact = 1;
        for (int i = 1; i <= n; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // values
            for (int j = 0; j <= i; j++) {
                int icj = fact(i) / (fact(j) * fact(i - j));
                System.out.print(icj + "  ");
            }

            System.out.println();
        }

        sc.close();
    }
}
