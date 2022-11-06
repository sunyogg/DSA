package searching.matrix;

import java.util.Arrays;

public class BinarySearchMatrixStrictlySorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(binarySearch2d(arr, 12)));
    }

    // All done by me :)
    public static int[] binarySearch2d(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int[] answer = {-1, -1};
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int insideEnd = matrix[mid].length - 1;
            if (target > matrix[mid][insideEnd]) {
                start = mid + 1;
            } else if (target < matrix[mid][insideEnd]) {
                if (target >= matrix[mid][0]) {
                    answer[0] = mid;
                    answer[1] =  binarySearch(matrix[mid], target,
                            0, matrix[mid].length - 1);
                    return answer;
                } else {
                    end = mid - 1;
                }
            } else {
                answer[0] = mid;
                answer[1] = insideEnd;
                return answer;
            }
        }
        return answer;
    }


    private static int binarySearch(int[] arr, int target,
                                    int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start ) / 2);
            if (target == arr[mid]) {
                return  mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start =mid + 1;
            }
        }
        return -1;
    }
}