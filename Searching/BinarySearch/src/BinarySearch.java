
// improved my binary search by looking at the code.

public class BinarySearch {

    // for ascending order.
    public static int ascendingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start) + ((end - start) / 2);
            int elementAtMiddle = arr[middle];
            if (target < elementAtMiddle) {
                end = middle - 1;
            } else if (target > elementAtMiddle) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // for descending order
    public static int descendingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middleIndex = start + ((end - start) / 2);
            if (target < arr[middleIndex]) {
                start = middleIndex + 1;
            } else if (target > arr[middleIndex]) {
                end = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    // Order agnostic Binary Search.
    public static int binarySearch(int[] arr, int target) {
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        int index;
        if (firstElement < lastElement) {
            index = ascendingBinarySearch(arr, target);
        } else {
            index = descendingBinarySearch(arr, target);
        }
        return index;
    }
}
