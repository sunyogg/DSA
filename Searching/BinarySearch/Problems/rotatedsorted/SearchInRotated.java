package searching.binarysearch.problems.rotatedsorted;
// 33

public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 12, 14, 16, 19, 21, 22, 1, 2, 3, 4, 5};
        arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        arr = new int[] {2, 9, 2, 2, 2};
//        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(searchInRotatedArray(arr, 2));
//        System.out.println(binarySearchIndexOfMin(arr));
    }
    public static int searchInRotatedArray(int[] arr, int target) {
        int minIndex = binarySearchIndexOfMin(arr);
        int answerIndex = binarySearch(arr, target, 0, minIndex - 1);
        if (answerIndex != -1) {
            return answerIndex;
        }
        return binarySearch(arr, target, minIndex, arr.length - 1);
    }

    // to find the index of minimum element in kind of sorted array.
    // finding the index of the pivot.
    private static int binarySearchIndexOfMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end ) {
            int mid = (start + (end - start ) / 2) ;
            // here we are trying to find the range where min will reside.
            // and then narrowing down that range.
            if (arr[mid] > arr[start]) {
                start = mid;
            } else if (arr[mid] < arr[start]) {
                end = mid;
            } else if (arr[mid] == arr[start]) {
                start = mid + 1;
            }
        }
        return end;
    }

    private static int binarySearch(int[] arr, int target,
                                   int start , int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}