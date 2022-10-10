public class Recursion1 {
    public static void main(String[] args) {
        // write a method to print a number.
        // print numbers from 1 to 5 only using same method.
        printNum1(1); // put the debugger here and check how stack is getting filled.
                      // because the function whose task is not finished sit in the stack memory.

    }

    public static void printNum1(int n) {
        System.out.println(n);
        printNum2(2);

    }
    public static void printNum2(int n) {
        System.out.println(n);
        printNum3(3);
    }
    public static void printNum3(int n) {
        System.out.println(n);
        printNum4(4);
    }
    public static void printNum4(int n) {
        System.out.println(n);
        printNum5(5);
    }
    public static void printNum5(int n) {
        System.out.println(n);
    }
}

// All the functions have same body and definition.
    // the functions are taking a parameter and printing
    // still we are only using one function to run all other function.