
// Wrote by me without looking at the code, with only understanding and
// debugging.

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9, 10, 12, 14};
        int start = 0;
        int end = arr.length - 1;
        int target = 1;
        int middle = ((start + end) / 2);
        while (middle > -1) {
            int elementAtMiddle = arr[middle];
            if (target < elementAtMiddle) {
                end = middle - 1;
                middle = (start + end)/2;
            } else if (target > elementAtMiddle) {
                start = middle + 1;
                middle = (start + end)/2;
            } else {
                System.out.println("Found " + arr[middle] +
                        " at index " + middle);
                break;
            }
        }
    }
}
