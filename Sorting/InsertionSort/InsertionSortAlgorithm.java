package sorting.insertionsort;// INSERTION SORT
// Steps gets reduced if array is sorted. Number of swaps are reduced as compared
// to bubble sort.

// STABLE

// Used for smaller values of n(length of array) -> works good when array is
// partially sorted. That's why is it takes part in hybrid sorting algorithms.


import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 3, 10, 2, 0, 4};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // done by me after understanding :)
    public static void insertionSort(int[] arr) {
        int i = 0;
        int j = i + 1;
        // In every pass index till i + 1 will be sorted.
        // Outer while loop is a pass.
        while (i <= arr.length - 2) {
            while (j > 0)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    j--;
                } else {
                    break;
                }
            i++;
            j = i + 1;
        }
    }
}