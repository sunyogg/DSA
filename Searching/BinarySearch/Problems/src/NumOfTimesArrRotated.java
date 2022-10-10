public class NumOfTimesArrRotated {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4};
        int[] newArr = {};
        System.out.println(findTimesRotated(newArr));

    }

    public static int findTimesRotated(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return start;
        }
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[start] ) {
                start = mid + 1;
            } else if (arr[mid] < arr[end] ) {
                end = mid - 1;
            }
        }
        return -1;
    }
}