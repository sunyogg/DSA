package searching.binarysearch.problems.rotatedsorted;
// 189

import java.util.Arrays;

public class RotateArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        r(arr, 0);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
    }

    public static void r(int[] arr, int k) {
        for (int j=0; j<k; j++) {
            int lastElement = arr[arr.length - 1];
            for (int i=arr.length-1; i>0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = lastElement;
        }
    }

    public static void rotate(int[] arr, int k) {
        for (int i=0; i<k; i++) {
            int last = arr.length - 1 - i;
            for (int j=0; j<arr.length - 1; j++) {
                arr[i] = arr[i+1];
            }
        }
    }

}