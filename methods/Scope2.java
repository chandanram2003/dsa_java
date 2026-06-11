public class Scope2 {
    static int i;

    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        fun();
        System.out.println(i);
    }

    public static void fun() {
        i=20;
      // System.out.println(i);
    }
}

// 16,20
