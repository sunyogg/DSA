
// 153

public class MinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
        int[] arr1 = {9, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {1, 0};
        int[] arr4 = {0};
        int[] arr5 = {4, 5, 6, 7, 0, 1, 2};
        int[] arr6 = {2, 2, 1, 1, 0, 0, };
        System.out.println(findMin(arr6));
    }

    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[start] < arr[end]) {
                return arr[start];
            }
            if (start == end) {
                return arr[start];
            } else if (arr[start] < arr[mid] || arr[mid] > arr[end]) {
                // increasing part
                start = mid + 1;
            } else if (arr[start] > arr[mid] || arr[end] > arr[mid]) {
                end = mid;
            }
        }
        return start;
    }
}