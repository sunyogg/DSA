package recursion.practice;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 4, 3 ,2};
        int j = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int lastIndex = arr.length - 1;
        selectionSortRecursion(arr, 0, j, max, maxIndex, lastIndex);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSortRecursion(int[] arr, int i, int j,
                                  int max, int maxIndex, int lastIndex) {
        if (i == arr.length-1) {
            return;
        }
        if (arr[j] > max) {
            max = arr[j];
            maxIndex = j;
        }
        if (j == lastIndex) {
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex]  = temp;
            max = Integer.MIN_VALUE;
            maxIndex = -1;
            i++;
            lastIndex = arr.length - 1 - i;
            j = -1;
        }
        selectionSortRecursion(arr, i, j+1, max, maxIndex, lastIndex);
    }
}