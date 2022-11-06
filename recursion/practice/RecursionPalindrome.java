package recursion.practice;

public class RecursionPalindrome {
    public static void main(String[] args ) {
        int ans = 0;
        int x = recursionPalindrome1(786868768);
        System.out.println(x);
    }

    // tough hai yar

    public static int recursionPalindrome1(int num) {
        if (num < 10) {
            return num;
        }
        int length = (int) (Math.log(num) / Math.log(10)) + 1;
        int lastDigit = num % 10;
        return ((lastDigit * (int)Math.pow(10, length-1) + recursionPalindrome1(num/10)));
    }

    public static int recursionPalindrome(int ans, int num) {
        if (num == 0) {
            return ans;
        }
        int lastDigit = num % 10;
        ans *= 10;
        ans += lastDigit;
        return recursionPalindrome(ans, num/10);
    }

    public static void checkPalindrome(int num) {
        int reversed = 0;
        while (num > 0) {
            int lastDigit = num % 10; // This will return the last digit.
            reversed *= 10;
            reversed += lastDigit;
            num/=10;
        }
        System.out.println(reversed);
    }
}