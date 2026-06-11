public class Scope3 {
    static int i;

    public static void main(String[] args) {
        i = 16;
        fun();
        int i = 23;
        fun();
    }

    public static void fun() {
        System.out.println(i);
    }
}
// 16 16