package sorting.selectionsort;// So we are going to select an element from the array and put it at it's right
// position.

// Not Stable.

// It's performs well on small array.


import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
        int max = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }


    // Done by me after understanding the concept :)
    public static void selectionSort(int[] arr) {

        // This for loop will insert the max element at the last index.
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int tempIndex = 0;
            // This loop will search for the max element, it also make sures
            // that we are not looking at elements that have already been sorted.
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    tempIndex = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[tempIndex] = temp;
        }
    }
}


