import java.util.Arrays;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 5, 5, 5, 6, 7, 11, 13, 14};
        int[] arr1 = {5, 7, 7, 7, 7, 8, 8, 10};

//        int[] array = firstAndLastBinarySearch(arr1, 7);
        int[] arrays = firstAndLastIndex(arr1, 7);
        System.out.println(Arrays.toString(arrays));
    }


    // better version;
    public static int[] firstAndLastIndex(int[] arr, int target) {
        int[] ans = new int[2];
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }


    // so what I am doing here is first finding the target number. Now when I
    // found the target number there can be same number behind and ahead of that
    // target number so what I do is  use 2 for loops one to find the first
    // occurrence and second to find the last occurrence.
    // so the loop to find the last occurrence will start from the (middle + 1)
    // index and end at the (index - 1) when the element is not equal to the
    // element at middle index, but before ending the loop will also set the value
    // of endPosition to the last index where the element was equal to the middle
    // element. In similar fashion another for loop will set the value of
    // startPosition and run from i=middle-1 to the first element of the array,
    // and it will also break if it finds an element not equal to the middle element
    // setting the value of startPosition to (i - 1) if 'i' was the index where
    // it broke.
    public static int[] firstAndLastBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start  + ((end - start) / 2);
            if (target == arr[middle]) {
                // do something here.
                int startPosition = middle;
                int endPosition = middle;

                for (int i=middle + 1; i<=end; i++) {
                    if (arr[middle] == arr[i]) {
                        endPosition = i;
                    } else {
                        break;
                    }
                }
                for (int i=middle - 1; i>=start; i--) {
                    if (arr[middle] == arr[i]) {
                        startPosition = i;
                    } else {
                        break;
                    }
                }
                int[] result = {startPosition, endPosition};
                return result;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }
        }
        int[] result = {-1, -1};
        return result;
    }



    public static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }
}



//                for (int i=middle; arr[i] != arr[middle]; i++) {
//                }