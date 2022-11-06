package searching.binarysearch.practice;

public class AgnosticBinarySearch {
    public static void main(String[] args) {

    }

    public static int agnosticBinarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            if (isAscending(arr)) {
                if (target < arr[middleIndex]) {
                    endIndex = middleIndex - 1;
                } else if (target > arr[middleIndex]) {
                    startIndex = middleIndex + 1;
                } else if (target == arr[middleIndex]) {
                    return middleIndex;
                }
            } else {
                // Descending
                if (target < arr[middleIndex]) {
                    startIndex = middleIndex + 1;
                } else if (target > arr[middleIndex]) {
                    endIndex = middleIndex - 1;
                } else if (target == arr[middleIndex]) {
                    return middleIndex;
                }
            }
        }
        return -1;
    }

    private static boolean isAscending(int[] arr) {
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        if (firstElement < lastElement) {
            return true;
        } else {
            // Descending
            return false;
        }
    }
}