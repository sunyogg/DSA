
// 1346

public class FindDouble {
    public static void main(String[] args) {
        int[] arr = {-10,12,-20,-8,15};
        System.out.println(checkIfExist(arr));
        // 2, 3, 5, 6, 10
    }

    public static boolean checkIfExist(int[] arr) {
        sortArray(arr);
        for(int i=0; i<arr.length; i++) {
            int first = arr[i];
            int target = first * 2;

            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                if (target == arr[mid] && i != mid) {
                    return true;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void sortArray(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j>0; j--) {
                if ( arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }


    public static boolean bruteForce(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int first = arr[i];
            for (int j=0; j<arr.length; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[j] == first * 2) {
                    return true;
                }
            }
        }
        return false;
    }
}