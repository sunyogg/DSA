
// done by me after watching the explanation and solution.

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int index1 = ceiling(arr, 12);
        int index = floor(arr, 20);
        System.out.println(index);

    }
    // Ceiling: smallest number in the array greater or equal to the target.
    public static int ceiling(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        if (target > arr[endIndex]) {
            return -1;
        }
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex)) / 2;
            if (target < arr[middleIndex]) {
                endIndex = middleIndex - 1;
            } else if (target > arr[middleIndex]) {
                startIndex = middleIndex + 1;
            } else if (target == arr[middleIndex]) {
                return middleIndex;
            }
        }
        return startIndex;
    }

    // CEILING: Greatest number in the array smaller or equal to the target.
    public static int floor(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        if (target < arr[startIndex]) {
            return -1;
        }
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            if (target == arr[middleIndex]) {
                return middleIndex;
            } else if (target < arr[middleIndex] ) {
                endIndex = middleIndex - 1;
            } else if (target > arr[middleIndex]) {
                startIndex = middleIndex + 1;
            }
        }
        return endIndex;
    }
}