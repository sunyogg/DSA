public class WeirdRecursion {
    public static void main(String[] args ) {
        int n = 1;
        printThis(n--);
        System.out.println(n);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n--);
    }

    public static void fun1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(--n);
    }



    // function that is passing --n is working fine whereas the function passing
    // n-- is acting weird that's because there is the difference in the wokring
    // of n-- and --n:
    // n-- pass the value first then subtract.
    // --n first subtract then pass the value.
    // use the function below to visualize what's happening.
    public static void printThis(int num) {
        System.out.println(num);
    }
}