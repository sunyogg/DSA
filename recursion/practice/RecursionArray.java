package recursion.practice;

public class RecursionArray {
    public static void main(String[] args ) {
        int[] arr = {1, 4, 5, 3, 9, 5};
        int i = 0;
//        recursionLoopArray(arr, i);
        recursionRangeLoopArray(arr, 0, 3);

    }

    public static void recursionLoopArray(int[] arr, int i) {
        if (i > arr.length - 1) {
            return;
        }
        System.out.println(arr[i]);
        recursionLoopArray(arr, ++i);
    }

    public static void recursionRangeLoopArray(int[] arr, int start,
                                                int end) {
        if (end > arr.length - 1) {
            return;
        }
        if (start > end) {
            return;
        }
        System.out.println(arr[start]);
        recursionRangeLoopArray(arr, ++start, end);

    }
}