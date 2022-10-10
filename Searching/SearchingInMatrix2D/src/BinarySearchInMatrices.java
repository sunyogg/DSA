 import java.util.Arrays;

public class BinarySearchInMatrices {
    public static void main(String[] args) {
        // so if the array is SORTED ROW wise and COLUMN wise.
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
//        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(binarySearch2d(arr, 38)));

    }

    public static int[] binarySearch2d(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;
        int[] answer = new int[] {-1, -1};
        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                answer[0] = row;
                answer[1] = column;
                return answer;
            } else if (target < matrix[row][column]) {
                // remove that whole column.
                column--;
            } else if (target > matrix[row][column]) {
                // remove that whole row.
                row++;
            }
        }
        return answer;
    }















    // so what I can do is loop through each row and apply binary search
    // in all the elements of the row.
    public static String tryingLinearAndBinary(int[][] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            int answer = binarySearch(arr[i],target );
            if (answer != -1) {
                return "Found " + target + " at " + i + ", " + answer;
            }
        }
        return "Not found";
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}