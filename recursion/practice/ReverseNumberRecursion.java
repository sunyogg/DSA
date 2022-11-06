package recursion.practice;

public class ReverseNumberRecursion {
    public static int  digit = 0;
    public static void main(String[] args ) {
        reverseNumRecursion(342);
        System.out.println(digit);
    }

    public static void reverseNumRecursion (int num) {
        if (num == 0) {
            return;
        }
        digit += (num%10);
        if (num > 10) {
            digit *= 10;
        }
        reverseNumRecursion(num/10);
    }


}