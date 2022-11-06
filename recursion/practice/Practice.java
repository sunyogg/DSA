package recursion.practice;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 0, 1, 6};
        int[] forCycle = {1, 6, 3, 5, 4, 2};
        insertionSortFor(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=1; j<arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void selectionSortFor(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j=0; j<arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int lastIndex = arr.length - 1 - i;
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    private static void SelectionSortWhile(int[] arr) {
        int i=0;
        while (i<arr.length - 1) {
            int j=0;
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            while (j<arr.length - 1 - i) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
                j++;
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[maxIndex];
            arr[maxIndex] = temp;
            i++;
        }
    }


    private static void insertionSortWhile(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int j = i + 1;
            while (j > 0) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                } else {
                    break;
                }
            }
            i++;
        }
    }

    private static void insertionSortFor(int[] arr) {
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

    // compare
    public static void cyclicSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[correctIndex] != arr[currentIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[currentIndex];
                arr[currentIndex] = temp;
            }
        }
    }

    // check its own position.
    // not completely correct.
    public static void cyclicSort2(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            int correct = i+1;
            if (arr[i] != i+1) {
                int temp = arr[i];
                arr[i] = i+1;
                arr[i+1] = temp;
            }
        }
    }
}