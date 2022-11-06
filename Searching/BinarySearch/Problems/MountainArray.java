package searching.binarysearch.problems;

// 852
// 162

// bitonic array
// We need to find the peek of the mountain array.
public class MountainArray  {
    public static void main(String[] args ){
        int[] mountainArray = {1, 3, 5, 7, 8, 10, 9, 6, 4, 2, -1, -2, -3, -5};
        int[] arr = {0, 1, 0};
        int[] tw0 = {1, 4, 2, 0};
        int[] karr = {1, 2, 3, 5, 6, 4, 3, 2};
//        System.out.println(findPeekInMountainBruteForce(mountainArray));
        System.out.println(findPeek2(mountainArray));
    }

    public static int findPeek(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;
//      // arr.length can never be 2.
//        if (arr.length == 2) {
//            if (arr[0] > arr[1]) {
//                    return 0;
//            }
//            return 1;
//        }
        while (start <= end) {
            mid = (start + (end - start ) / 2);
            if (arr[mid] < arr[mid + 1]) {
                // we are in ascending range.
                // therefore we will check from mid + 1 to end.
                // because mid + 1 is greater than mid.
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                // we are in descending range.
                // this maybe the answer.
                // therefore we check from start to mid.
                end = mid;
            }
        }
        return start;
    }


    public static int findPeek2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = start + ((end - start ) / 2 );
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }














    public static int findPeekInMountainBruteForce(int[] mountainArray) {
        for (int i=1; i < mountainArray.length - 1; i++) {
            if (mountainArray[i-1] < mountainArray[i] &&
                    mountainArray[i] > mountainArray[i+1]) {
                return i;
            }
        }
        return -1;
    }
}






















// let's talk about what is a mountain Array:
// A mountain array is a type of array that contain element or numbers in such a
// way so that they are increasing at first and then after reaching the peek
// they then start decreasing.

// Example of mountain array:
// int[] mountainArray = [1, 2, 3, 4, 5, 6 ,8, 10, 7, 6, 5, 4, 2, 1]
// You can see how the numbers at first are increasing till 10 which is a peek
// and after 10 they start decreasing.
// Just a general idea that maybe a mountain is such that:
// numbers before peek won't increase and numbers after peek won't decrease.