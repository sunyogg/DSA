import java.util.ArrayList;
import java.util.Arrays;

public class TestFibonacci {

    private static ArrayList<Integer> fibos = new ArrayList<Integer>();
    public static void main(String[] args) {
        fibos.add(0);
        fibos.add(1);
        fibonacciAt(7);
    }

    public static void basicFibonacci(int n) {
        for (int i=2; i<n; i++) {
            int result = fibos.get(i - 2) + fibos.get(i - 1);
            fibos.add(result);
        }
    }

    public static void simplerFibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i<n; i++) {
            int result = arr[i - 1] + arr[i-2];
            arr[i] = result;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fibonacciAt(int index) {
        int secondLast = 0;
        int last = 1;
        int i = 2;
        int result = 0;
        while (i != index + 1) {
            result = secondLast + last;
            secondLast = last;
            last = result;
            i++;
        }
        System.out.println(result);
    }


}