
// 268

import java.util.Arrays;

public class MissingNumberCyclic {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        anotherMethod(arr);
        System.out.println(Arrays.toString(arr));
    }

    // we are following steps/ process that we have been taught.
    // we are assuming arr contains element 1 to n. And we will ignore 0.
    // so in the process of arranging all other element and ignoring 0
    // after the array has been sorted 0 will be at the index of the value
    // which is missing and since this is cyclic sort hence we can just
    // return index + 1

    public static int cycleSortMissing(int[] arr) {
        int i=0;
        int answer = 0;
        while (i < arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[currentIndex] == 0) {
                answer = currentIndex + 1;
                i++;
            }
            else if (arr[currentIndex] == arr[correctIndex] ) {
                i++;
            } else {
                swap(arr, currentIndex, correctIndex);
            }
        }
        return answer;
    }

    public static int anotherMethod(int[] arr) {
        int i = 0;
        int ans = arr.length;
        while (i < arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i];
            int lastIndex = arr.length - 1;
            if (arr[i] > lastIndex) {
                ans = i;
                i++;
            } else if (currentIndex == correctIndex) {
                i++;
            } else {
                swap(arr, currentIndex, correctIndex);
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