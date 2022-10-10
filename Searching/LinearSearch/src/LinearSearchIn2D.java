public class LinearSearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 6, 8},
                {9, 11, 13},
                {15, 16, 17, 18, 19, 20}
        };

        findIn2d(arr, 13);


    }

    public static boolean findIn2d (int[][] arr, int target) {
        for (int row=0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    System.out.println("Found " + target + " at " + row + "," + column);
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }


}
