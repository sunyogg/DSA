import java.util.ArrayList;

public class findTheDuplicate {

    private static ArrayList<Integer> ans = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(anotherMethod(arr));

    }

    public static int anotherMethod(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != i + 1) {
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static int findDuplicateInCycle(int[] arr) {
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
                return arr[j];
            }
        }
        return -1;
    }
    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }


}
