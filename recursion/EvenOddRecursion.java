public class EvenOddRecursion {
    public static void main(String[] args) {
        evenOddRecursionInRange(1, 40);
    }

    public static void evenOddRecursionInRange (int start, int range) {
        if (start > range) {
            return;
        }
        if (start % 2 == 0) {
            System.out.println(start + " is even.");
        } else {
            System.out.println(start + " is odd.");
        }
        evenOddRecursionInRange(start+1, range);
    }
}