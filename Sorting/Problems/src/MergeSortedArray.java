// 88

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        mergeSortedArray(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    public static void mergeSortedArray(int[] arr, int m,
                                        int[] arr2, int n) {
        for (int i=m; i<m+n; i++) {
            arr[i] = arr2[i-n];
        }
        // now sort the array. Insertion sort.
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j>1; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}

// m - number of element in arr1
// n - number of element in arr2 =
//     number of zeros in arr1 at last.
