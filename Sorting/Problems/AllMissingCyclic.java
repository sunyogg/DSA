package sorting.problems;
// 448


import java.util.ArrayList;
import java.util.List;

public class AllMissingCyclic {



    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        betterMethod(arr);
        System.out.println(findAllMissingInArr(arr));

    }

    // done by me :)
    public static List<Integer> findAllMissingInArr(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int i=0;
        while (i < arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;

            if (arr[currentIndex] == arr[correctIndex]) {
                i++;
            } else {
                if (arr[currentIndex] == arr[correctIndex]) {
                    i++;
                } else {
                    swap(arr, currentIndex, correctIndex);
                }
            }
        }
        for (int j=0; j<arr.length; j++) {
            if (arr[j] == j+1) {
            } else {
                ans.add(j+1);
            }
        }
        return ans;
    }

    public static void betterMethod(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int i=0;
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
            if (arr[j] == j+1) {
                continue;
            } else {
                ans.add(j+1);
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}