public class Frequency {
    public static void main(String[] args) {
        String str = "hello";
        char ch1 = 'l';
        int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ch1) {
                freq++;
            }
        }
        System.out.println(freq);
    }
}
