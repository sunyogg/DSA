
// gfg

public class CountOfRotated {
    public static void main(String[] args) {
        int[] arr = {10, 12 ,13, 14, 17, 1, 2, 4, 5, 6, 9};
        arr = new int[] {1, 2, 3, 4, 5, 6};
        arr = new int[] {5, 6, 9, 10, 12 ,13, 14, 17, 1, 2, 4};
        System.out.println(findTimesArrayRotated(arr));
    }

    public static int findTimesArrayRotated(int[] arr) {
        int pivotIndex = findIndexOfPivot(arr);
        return pivotIndex + 1;
    }

    private static int findIndexOfPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid != end && arr[mid] > arr[mid + 1]  ) {
                return mid;
            } else if (mid != start && arr[mid] < arr[mid - 1] ) {
                return mid - 1;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else if (start != end && arr[mid] == arr[start]  ) {
                start = mid + 1;
            } else if (start == end) {
                start ++;
            }
        }
        return -1;
    }
}