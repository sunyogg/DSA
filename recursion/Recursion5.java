public class Recursion5 {
    public static void main(String[] args ) {
        funBoth(5);
    }


    public static void fun(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    // Before function was doing its work then it was calling another function
    // so as the function enters stack memory it's work is to enter the current
    // function. Then call the another function.
    // And the function below enters the stack memory calls another function,
    // Then wait for the calling function to finish its work and then it finishes
    // its own work.
    // Here we want the function to do it's work when it is getting removed from
    // the stack memory.
    public static void funReverse(int n) {
        if (n < 1) {
            return;
        }
        funReverse(n-1);
        System.out.println(n);
    }

    public static void funBoth(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        funReverse(n-1);
        System.out.println(n);
    }



    public static void fun1(int start, int n) {
        if (start > n) {
            return;
        }
        System.out.println(start);
        fun1(start+1, n);
    }
}