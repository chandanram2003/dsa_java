import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            rev = rev + str.charAt(j);
        }
        if (str.equals(rev)) {
            System.out.print("palindronmme");
        } else {
            System.out.print("not palindrome ");
        }
    }
}
