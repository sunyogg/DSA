package recursion.Problems.src;

public class CountZeros {
    public static void main(String[] args) {
        int zero = 0;
        System.out.println(countZeros(20340560, zero));
    }

    public static int countZeros(int num, int zero) {
        if (num == 0) {
            return zero;
        }
        if (num%10 == 0) {
            ++zero;
        }
        return countZeros(num/10, zero);
    }
}