public class RecursionFactorial {
    public static int ans = 1;
    public static void main(String[] args ) {
        System.out.println(factorialRecursion1(5));
     }

     //better
    public static int factorialRecursion1(int n ) {
        if (n < 2) {
            return n;
        }
        return (n * factorialRecursion1(n-1));
    }

    public static void factorialRecursion(int num) {
        if (num < 2) {
            return;
        }
        ans = ans * num;
        factorialRecursion(num - 1);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i=2; i<=n; i++) {
            result *=i;
        }
        return (result);
    }
}