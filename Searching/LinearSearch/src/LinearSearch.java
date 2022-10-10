public class LinearSearch {


    public static int linearSearch(int[] arr, int elementToFind) {
        if (arr.length == 0) {
            return -1;
        }
        int checker = 0;
        for (int index=0; index<arr.length; index++) {
            if (arr[index] == elementToFind) {
                System.out.println("Found "+ elementToFind +" at " + index );
                checker += 1;
                return index;
            }
        }
            System.out.println("Not found");
            return -1;
    }

    public static int linearSearchInRange(int[] arr, int startIndex,
                                          int endIndex, int target) {
        if (startIndex < 0 || endIndex > arr.length -1) {
            return -1;
        }
        for (int i=startIndex; i<= endIndex; i++) {
            if (arr[i] == target) {
                System.out.println("Found " + target + " at " + i);
                return i;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}