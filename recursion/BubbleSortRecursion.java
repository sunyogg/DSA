import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 4, 3 ,2};
        int j=1;
        bubbleSortRecursion(arr, 0, j);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortRecursion(int[] arr, int i, int j) {
        if (i==arr.length - 1) {
            return;
        }
        if (arr[j] < arr[j-1]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
        if (j==arr.length - 1 - i) {
            i++;
            j=0;
        }
        bubbleSortRecursion(arr, i, j+1);
    }
}