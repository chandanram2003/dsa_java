public class Marks {
    public static void main(String[] args) {
        int arr[] = { 70, 80, 50, 35, 21, 7 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 35) {
                System.out.println(i + " ");
            }
        }
    }
}
