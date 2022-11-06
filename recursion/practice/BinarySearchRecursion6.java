package recursion.practice;

public class BinarySearchRecursion6 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 8, 9, 10, 13};
        int answer = binarySearchRecursion(arr, 13, 0, arr.length - 1);
        System.out.println(answer);

    }
    // Binary Search using Recursion done by me.
    public static int binarySearchRecursion(int[] arr, int target,
                                            int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start ) / 2 );
        if (target == arr[mid]) {
            return mid;
        } else if  (target < arr[mid]) {
            return binarySearchRecursion(arr, target, start, mid - 1 );
        } else {
            return binarySearchRecursion(arr, target, mid + 1, end);
        }
    }

    public static int basicBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start ) / 2);
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}