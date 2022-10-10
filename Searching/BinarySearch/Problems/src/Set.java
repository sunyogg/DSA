import java.util.ArrayList;

public class Set {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5, 6, 6, 7, 8};
        ArrayList<Integer> set = new ArrayList<Integer> ();
        ArrayList<Integer> repeated = new ArrayList<Integer> ();

        for (int i=0; i<arr.length; i++) {
            if (repeated.contains(arr[i])) {
                continue;
            }
            int counter = 0;
            for (int j=i+1; j<arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    repeated.add(arr[i]);
                    counter ++;
                }
            }
            if (counter == 0) {
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}

