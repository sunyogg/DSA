public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(625));

    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num/2;
        int counter = 0;
        while (start <= end) {
            counter ++;
            int mid = start + ((end - start) / 2);
            int squared = mid * mid;
            if (squared == num) {
                return true;
            } else if (squared > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}