public class LinearSearchInMatrices {
    public static void main(String[] args) {
        int[][] arr  = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16, 19}
        };
        int target = 19;
        System.out.println(linearSearchIn2d(arr, target));

    }













    public static String linearSearchIn2d(int[][] arr, int target) {
        // outer loop is for the row.
        for (int i=0; i<arr.length; i++) {
            // inner loop is for the column.
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return ("Found " + target + " at " + i + ", " + j);
                }
            }
        }
        return ("Not found");
    }
}