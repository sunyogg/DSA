package searching.binarysearch.problems;
// 2089

import java.util.ArrayList;

public class FindRangeOfDuplicate {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 6, 6, 6, 6, 6, 10, 11, 8, 7};
        System.out.println(findRange(arr, 1));

    }

    public static ArrayList<Integer> findRange(int[] arr, int target) {
        sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int start = 0;
        int end = arr.length - 1;
        int left = -1;
        int right = -1;
        // for right
        // this can also be used for finding the right most duplicate element.
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                if (mid == arr.length-1) {
                    right = mid;
                    break;
                }
                if (arr[mid] < arr[mid + 1]) {
                    right = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (right == -1) {
            return ans;
        }

        // for left
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                if (mid == 0) {
                    left = mid;
                    break;
                }
                if (arr[mid] > arr[mid-1]) {
                    left = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        for(int i=left; i<=right; i++) {
            ans.add(i);
        }
        return ans;
    }

    public static void sort(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j>0; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }


}
