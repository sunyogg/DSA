public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(findPerfectSquare3(157));
    }

    // brute force
    public static int findPerfectSquare(int num) {
        for (int i=2; i<num; i++) {
            if (i * i == num) {
                return i;
            }
        }
        return -1;
    }

    // minimising the range
    public static int findPerfectSquare2(int num) {
        if (num == 4) {
            return 2;
        }
        for (int i=2 ; i<=num/3; i++) {
            if (i * i == num) {
                return i;
            }
        }
        return -1;
    }

    // since we are searching in a range which is increasing i.e. sorted.
    // we should binary search
    public static double findPerfectSquare3(int num) {
        if (num == 4) {
            return 2;
        } else if (num == 1) {
            return 1;
        }
        int start = 2;
        int end = (num/3);
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid < num) {
                start = mid + 1;
            }
        }
        double point = end;
        while (point * point < num) {
            point += 0.01;
        }
        return point;
    }
}