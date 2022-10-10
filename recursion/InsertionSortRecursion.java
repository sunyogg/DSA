import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args ) {
        int[] arr = {2, 1};
        int i=0;
        int j=i+1;
        InsertionSortRecursion(arr, i, j);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSortRecursion(int[] arr, int i, int j) {
        if (i > arr.length - 2) {
            return;
        }
        if (j < 1) {
        i++;
        j=i+1;
        } else if (arr[j] < arr[j-1]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        } else {
            i++;
            j=i+1;
        }
        InsertionSortRecursion(arr, i, j);
    }
    
    public static void simpleInsertionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j--) {
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