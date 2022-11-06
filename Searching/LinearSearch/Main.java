package searching.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 34, 90, 23, 56, 83, 2, 3, 89, 34, 69};
        LinearSearch.linearSearch(arr, 90);
        LinearSearch.linearSearchInRange(arr, 1, 6, 89);
        System.out.println(LinearSearch.findMin(arr));
        System.out.println(LinearSearch.findMax(arr));
    }
}