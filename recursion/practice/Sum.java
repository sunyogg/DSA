package recursion.practice;

public class Sum {
    public static void main(String[] args) {
        int ans = 0;
        System.out.println(sumOfDigits(32423));
    }
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        }
        return num%10 + sumOfDigits(num/10);
    }

    public static void sumDigits(int num) {
        int ans = 0;
        while (num > 0) {
            int lastDigit = num%10;
            ans += lastDigit;
            num /= 10;
        }
        System.out.println(ans);
    }
}