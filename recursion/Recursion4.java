public class Recursion4 {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        // base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a
        // different function stored in the memory.
        // This is tail recursion, because last statement is a recursive call.
        print(n + 1);
    }
}

// if we don't put the base condition than we will get an error, which kinda
// indicates that the stack has run out of memory, since there is no base condition
// function will be called again and again infinitely, which will fill the
// limited stack memory hence we cannot call remaining/ other function.

// It's helps us in solving bigger/complex problems in a single way.

// You can convert recursion solution iteration and vice versa.

// space complexity is not constant because of recursive calls.

// helps us in bigger problems into smaller problems.
