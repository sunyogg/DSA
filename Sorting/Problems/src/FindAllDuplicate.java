
// 442

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicate {
    private static ArrayList<Integer> ans = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        betterMethod(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }

    public static void betterMethod(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[currentIndex] == currentIndex + 1) {
                i++;
            } else {
                if (arr[currentIndex] != arr[correctIndex]) {
                    swap(arr, currentIndex, correctIndex);
                } else {
                    if (!ans.contains(arr[i])) {
                        ans.add(arr[i]);
                    }
                    i++;
                }
            }
        }
    }

    public static void findAllDuplicates(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[currentIndex] == arr[correctIndex]) {
                i++;
            } else {
                swap(arr, currentIndex, correctIndex);
            }
        }
        for (int j=0; j<arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(arr[j]);
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}