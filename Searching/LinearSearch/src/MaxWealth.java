public class MaxWealth {
    public static void main(String[] args) {
         int [][]accounts = {{1,2,3}, {2, 1, 3}};
        System.out.println(countWealth(accounts));

    }

    public static int countWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i=0; i<accounts.length; i++) {
            int counter = 0;
            for (int j=0; j<accounts[i].length; j++) {
                counter += accounts[i][j];
            }
            if (counter >= maxWealth) {
                maxWealth = counter;
            }
        }
        return maxWealth;
    }
}