package sorting.cyclesort;
// The array must contain integers 1 through n.
// correct index of that value = value - 1
// index of value = value - 1

// Check the very first value:
//     if swap == true:
//         swap with correct index but 'i' should remain at same index.
//     else :
//         i++

// if the range is given like 1 through n or 0 through n then always using cycleSort.

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 6, 4};
        cycleSortWhile(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSortWhile(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[currentIndex] == arr[correctIndex]) {
                i++;
            } else {
                swap(arr, currentIndex, correctIndex);
            }
        }
    }

    // done by me after understanding the concept :)
    public static void cycleSortFor(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            int currentIndex = i;
            int correctIndex = arr[currentIndex] - 1;
            if (currentIndex == correctIndex) {
            } else {
                swap(arr, currentIndex,correctIndex);
                i--;
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}