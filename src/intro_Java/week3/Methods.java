package intro_Java.week3;

/**
 * Created by Joker on 25.12.2016.
 */
public class Methods {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("Inside A");
        b();
    }
    private static void b() {
        System.out.println("Inside B");
        c();
    }
    private static void c() {
        System.out.println("Inside C");
    }
}

