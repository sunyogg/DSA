// done by me.
// Ceiling of number: Smallest Element in array greater or equal to the
//                    target Number.

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 21, 22, 25, 27};
        int[] darr = {19, 17, 15, 10, 6, 4, 1, -3};
        int[] test = {1};

        int ceiling = findCeilingBinarySearch(arr, 2); // 16
        System.out.println(ceiling);
    }


    // done by me, fully by understanding and working
    public static int findCeilingBinarySearch(int[] arr, int ceilingOf) {
        int start = 0;
        int end = arr.length - 1;
        if (ceilingOf <= arr[start]) {
            return start;
        }

        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if (arr[middle] >= ceilingOf && arr[middle - 1] <= ceilingOf) {
                return middle;
            } else if (arr[middle] <= ceilingOf) {
                start = middle + 1;
            } else if (arr[middle] >= ceilingOf && arr[middle - 1] >= ceilingOf) {
                end = middle - 1;
            }
        }
        return -1;
    }














    public static int findCeilingLinearSearch(int[] arr, int target) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min && arr[i] >= target) {
                min = arr[i];
            }
        }
        return min;
    }


    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (isAscending) {
                if (target == arr[middle]) {
                    return middle;
                } else if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            }
            else {
                if (target == arr[middle]) {
                    return middle;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                } else if (target > arr[middle]) {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}