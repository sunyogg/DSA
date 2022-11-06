package recursion.Problems.src;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int result = (fibonacciRecursion(4));
        System.out.println(result);

    }

    public static int fibonacciRecursion(int n) {
        if (n < 2) {
            return n;
        }
        // This is not a tail recursion because last statement is not a
        // recursive call, last statement is returning the addition of numbers
        // returned by two recursive function.
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
// -298632863






// base condition that i found:
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } 