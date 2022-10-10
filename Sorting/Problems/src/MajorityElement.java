
// 169

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2, 1 ,2, 3, 3, 3 ,3 ,3 ,3, 3, 3, 3, 3 };
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        // let's sort the array first.
        int i=0;
        while (i<arr.length) {
            int j=0;
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            int lastIndex = arr.length - 1 - i;
            while (j < arr.length-i) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
                j++;
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            i++;
        }
        // partial binary search here
        int start = 0;
        int end = arr.length - 1;
        int mid = start + ((end - start)/2);
        return arr[mid];
    }
}