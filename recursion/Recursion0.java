public class Recursion0 {
    public static void main(String[] args) {
        greet();
    }

    public static void greet() {
        System.out.println("Hello");
        greet1();
    }

    public static void greet1() {
        System.out.println("Hello");
        greet2();
    }

    public static void greet2() {
        System.out.println("Hello");
        greet3();
    }

    public static void greet3() {
        System.out.println("Hello");
    }


}
