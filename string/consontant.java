// class Demo {
//     public static void main(String[] args) {

//         String str = "hello";
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
//                 count++;
//             }
//         }

//         System.out.println("Consonants = " + count);
//     }
// }

// converting the string to the uppercase without the method 

// public class consontant {
//     public static void main(String[] args) {
//         String str = "hello";
//         String ans = "";

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 ch = (char) (ch - 32);
//             }

//             ans = ans + ch;
//         }

//         System.out.println(ans);
//     }

// }

// frequency of a charecter 

// public class consontant {
//     public static void main(String[] args) {
//         String str = "hello";
//         char ch1 = 'l';
//         int freq = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == ch1) {
//                 freq++;
//             }
//         }
//         System.out.println(freq);
//     }

// }

// remove all spaces in a string 

public class consontant {

    public static void main(String[] args) {
        String str = "hii i am chandan";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // agar space nahi hai to add karo
            if (ch != ' ') {
                ans = ans + ch;
            }
        }
        System.out.println(ans);

    }

}