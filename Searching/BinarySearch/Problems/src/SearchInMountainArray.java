public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 10, 9, 6, 4, 3, 2, -1, -2, -3, -5};
        System.out.println(findInMountain(arr, 3));

    }

    public static int findInMountain(int[] arr, int target ) {
        int peek = findPeek(arr);
        int leftAnswer = ascendingBinarySearch(arr, peek, target);
        if (leftAnswer == -1) {
            int rightAnswer = descendingBinarySearch(arr, peek, target);
            return rightAnswer;
        } else {
            return leftAnswer;
        }
    }

    private static int findPeek(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = (start + (end - start ) / 2) ;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }




    public static int ascendingBinarySearch(int[] arr, int peek, int target) {
        int start = 0;
        int end = peek;
        while (start <= end) {
            int mid = start + ((end - start ) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    public static int descendingBinarySearch(int[] arr, int peek, int target) {
        int start = peek + 1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start ) / 2);
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

}