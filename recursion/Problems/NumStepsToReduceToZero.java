package recursion.Problems;// 1342

public class NumStepsToReduceToZero {

    public static void main(String[] args ) {
        int steps = 0;
        System.out.println(numberOfSteps(200));

    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    // for counters use base condition
    // and simply return the counter from the base condition.
    // use helper if you somehow cannot take the default value of some vars.
    public static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 ==0) {
            ++steps;
            return helper(num/2, steps);
        } else {
            ++steps;
            return helper(num - 1, steps);
        }
    }
}
