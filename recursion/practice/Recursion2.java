package recursion.practice;

public class Recursion2 {

    static int result = 1;

    public static void main(String[] args) {
//        greet(5);
        findPowerUsingRecursion(5, 4);
        System.out.println(result);
    }


    public static void greet(int n) {
        if (n == 0) { // base case.
            return;
        }
        System.out.println("Hello World, I am learning Recursion.");
        greet(n - 1); // relation between problem and subProblem.
    }


    public static void findPowerUsingRecursion(int powerOf, int power) {
        if (power == 0) {
            return;
        }
        result *= powerOf;
        findPowerUsingRecursion(powerOf, power - 1);
    }
}

// base condition is a condition that stops the recursion process.