package sorting.bubblesort;
// bubble sort is a STABLE sorting algorithm which means that the order of the
// same values in unsorted array is maintained in the sorted array.

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        arr = new int[] {10, 20, 20, 30, 10}; // example for checking STABLE.
        arr = new int[] {1, 2, 3, 4, 5};
        arr = new int[] {2, 1, 3, 4, 5};


        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i=0; i<arr.length - 1; i++) {
            swapped = false;
            for (int j=1; j<arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}













//    public static int[] bubbleSort(int[] arr) {
//        // this outer loop will run for every largest element and every iteration
//        // of it will move the largest number to the right-hand side.
//        boolean swapped;
//        for (int i=0; i<arr.length - 1; i++) {
//                swapped = false;
//                int till = arr.length - i;
//            for (int j=1; j<till; j++) {
//                // In every Iteration 2 numbers adjacent numbers are being
//                // compared and bigger of them is shifted right.
//                if (arr[j] < arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swapped = true;
//                }
//            }
//            // if you did not swap for a particular value of i, it means the
              // array is sorted hence break the loop and return the same array.
//            if (!swapped) {
//                break;
//            }
//        }
//        return arr;
//    }