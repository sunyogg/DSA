package sorting.problems;

// 414
public class ThirdMaxNum {
    public static void main(String[] args) {
        int[] arr = {2, 1};
        System.out.println(thirdMaxNum(arr));
    }

    public static int thirdMaxNum(int[] arr) {
        // let's sort the array first.
        if (arr.length < 2) {
            return arr[arr.length-1];
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                return arr[0];
            }
            return arr[1];
        }
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j>1; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr[arr.length - 3];
    }
}