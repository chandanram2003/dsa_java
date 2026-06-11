public class Scope1 {
    static int i;

    public static void main(String[] args) {
        i = 16;
        fun();
    }

    public static void fun() {
        System.out.println(i);
    }
}
// 16