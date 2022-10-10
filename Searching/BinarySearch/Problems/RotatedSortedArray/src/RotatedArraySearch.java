// 33
public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] arr = {5, 7, 0, 1, 2, 3, 4};
        System.out.println(findMaxEvolved(arr));
//        System.out.println(findTargetInRotated(arr, 0));

    }

    public static int findTargetInRotated(int[] arr, int target) {
        int pivot = findMax(arr);
        int ans = binarySearch(arr, target, 0, pivot);
        if (ans == -1) {
            ans = binarySearch(arr,target, pivot+1, arr.length-1);
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int target,
                                   int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Not working properly
    public static int findMaxEvolved(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[0]) {
                if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                } else {
                    start = mid;
                }

            } else if (arr[mid] < arr[0]) {
                end = mid - 1;
            }
        }
        return start;
   }









    // we are getting error when max at index 0 and at index last.

    public static int findMax(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] >= arr[0]) {
                // we are in left-hand side.
                if (mid == arr.length-1) {
                    return mid;
                }
                if (arr[mid] < arr[mid+1]) { //
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                // we are in right-hand side.
                // if we are in right-hand side. Then why check there?
                // simply bring the end pointer to mid - 1
                if (mid == 0) {
                    return mid;
                }
                if (arr[mid] > arr[mid-1]) { //
                    end = mid - 1;
                } else {
                    return mid-1;
                }
            }
        }// ends while loop
        return -1;
    }
}


