public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24,
                25, 27, 30, 34, 35, 36, 37, 39, 40, 42, 43, 44, 47, 48, 49, 50};
        int target = 25;
//        int[] range = getRange(arr, 50);
//        System.out.println(Arrays.toString(range));

        System.out.println(binarySearchInfiniteArray(arr, target));
        System.out.println(infiniteBinarySearch(arr, 50));
    }

//---------------------------------------------------------------------------------------------

    public static int binarySearchInfiniteArray(int[] arr, int target) {
        int[] range = getRange(arr, target);
        int start = range[0];
        int end = range[1];
        if (start == -1 ) {
            return -1;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    // but we are not supposed to use arr.length
    // find someway so you don't have to use length.
    // done by me...
    public static int[] getRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int[] ans = {-1, -1};
        // You were not supposed to use length here.
        while (start <=  arr.length) {
            if (arr[start] <= target && arr[end] >= target) {
                ans[0] = start;
                ans[1] = end;
                return ans;
            } else {
                start = end + 1;
                end = (start * 2) + 1;

                if (end > arr.length - 1) {
                    end = arr.length - 1;
                }
            }
        }
        return ans;
    }

//--------------------------------------------------------------------------------------------
    // better
    public static int infiniteBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            // end = end + (double the size of the previous box)
            // end = end + ((end - start) * 2)
            end = end + ((end - temp + 1) * 2);
        }
        return binarySearch(arr, target, start ,end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2 );
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}