package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 1, 0, -1, 1, -2, -3};

        insertionSortUsingFor(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSortUsingWhile(int[] arr) {
        int i = 0;
        int j = i + 1;
        while (i < arr.length - 1) {
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    j--;
                } else {
                    break;
                }
            }
            i++;
            j = i+1;
        }
    }

    public static void insertionSortUsingFor(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j>0; j--) {
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