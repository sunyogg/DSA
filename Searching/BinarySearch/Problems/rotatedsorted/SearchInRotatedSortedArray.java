package searching.binarysearch.problems.rotatedsorted;// Now this is what we're going to do:

/*
1) Check if the left-hand side of the array is sorted:
   if it is sorted check if the target will lye in the sorted array:
   if not then search in right-hand side of the array.

2) If the array is not sorted than divide the array in 2 and check if the left
   hand side is sorted or not.
*/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4};
        int target = 2;
    }

    public int searchInRotated(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[start] < arr[mid]) {
                // left-hand side is sorted.
                if (arr[start] <= target && arr[mid] >= target) {
                    // do the binary search here to find the element.
                    end = mid - 1;
                } else {
                    // Element not found. Move to the unsorted part.
                    start = mid + 1;
                }
            } else {
                // if left is not sorted move to the right-hand side.
                // and check everything again.
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/*
OBSERVATION:
 1) In rotated sorted array. One side of the mid has to be sorted.
    it's never going to  happen that both the sides of the mid are unsorted in
    'rotated sorted array'.

WHAT WE CAN DO TO FIND THE ELEMENT IN THE ROTATED SORTED ARRAY.
 1) Divide the array in 2 parts.
    We will get one sorted and another unsorted part.

 2) Check which part is sorted by comparing the 'start' and 'end' with 'mid'.
    for left part to be sorted:
        start < mid
    for right part to be sorted:
        end > mid

 3) Since one part of the array is always going to be sorted:
        We first search in the sorted part:
            Compare the first and last element with the target:
            Check if the element is present.
                If the element is present.
                    Return the index.
                If the element is not present in the sorted part:
                    Move to the unsorted part and follow step '1'

 */
