public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 12, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(isSortedRecursion1(arr, 0));
    }


    public static boolean isSortedRecursion(int[] arr, int i) {
        if (i >= arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSortedRecursion(arr, ++i);
    }

    public static boolean isSortedRecursion1(int[] arr, int i) {
        if (i >= arr.length - 1) {
            return true;
        }
        return (arr[i] < arr[i+1]) && isSortedRecursion1(arr, ++i);

    }

    public static boolean isSorted(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            if (arr[start] > arr[start + 1] || arr[end] < arr[end - 1]) {
                return false;
            }
            start ++;
            end --;
        }
        return true;

    }
}