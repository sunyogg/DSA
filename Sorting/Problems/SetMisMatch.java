package sorting.problems;
// 645

import java.util.Arrays;

public class SetMisMatch {
//    private static ArrayList<Integer> ans = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] x = findMisMatch(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(x));

    }

    public static int[] findMisMatch(int[] arr) {
        int[] ans =  {-1, -1};
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
           if  (arr[j] != j+1) {
               ans[0] = arr[j];
               ans[1] = j+1;
               return ans;
           }
        }

        return ans;
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}