
// 41

public class FirstMissingPositive {
    public static void main(String[] args) {
    int[] arr = {-2, 3, 8, 9, 11, 12};
    int x = findFirstMissingPositive(arr);
        System.out.println(x);
    }

    public static int findFirstMissingPositive(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int currentIndex = i;
            int correctIndex = arr[i] - 1;
            if (arr[currentIndex] >= 0 && arr[currentIndex]<arr.length && arr[currentIndex] != arr[correctIndex]) {
                swap(arr, currentIndex, correctIndex);
            } else {
                i++;

            }
        }
        // search for first missing number.
        for (int index=0; index<arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
        }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

    }


}