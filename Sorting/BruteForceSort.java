import java.util.Arrays;

public class BruteForceSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2, -3};

        System.out.println(Arrays.toString(bruteForceSort(arr)));
    }

    public static int[] bruteForceSort(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i=0; i<sortedArr.length; i++) {
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for (int j=0; j<arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    temp = j;
                }
            }
            sortedArr[i] = min;
            arr[temp] = Integer.MAX_VALUE;
        }
        return sortedArr;
    }
}