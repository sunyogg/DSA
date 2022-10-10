import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args ) {
        int[] arr = {1, 3, 4, 5, 6, 9, 10, 12, 15, 20, 22, 27, 28};
        System.out.println(Arrays.toString(rotateAboutPivot(arr, 4)));
    }

    public static int[] rotateAboutPivot(int[] arr, int pivotIndex) {
        int[] rotatedArr = new int[arr.length];
        for (int i=pivotIndex; i<arr.length; i++) {
            rotatedArr[i - pivotIndex]= arr[i];
        }
        for (int i=0; i<pivotIndex; i++) {
            int last = pivotIndex - i;
            rotatedArr[rotatedArr.length - last] = arr[i];
        }
        return rotatedArr;
    }
}