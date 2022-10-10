
// 628

public class MaxProductThree {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 6, 8};
        System.out.println(maxProductOfThree(arr));
    }
    public static int maxProductOfThree(int[] arr) {
        if (arr.length == 3) {
            return arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
        } else if (arr.length < 3) {
            return -169;
        }
        // let's sort the array first.
        for (int i=0; i<arr.length-1; i++) {
            boolean swapped = false;
            for (int j=1; j<arr.length - i; j++){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
    }
}