package searching.binarysearch.practice;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9, 10, 12, 14};
        int[] desArr = {14, 12, 10, 9, 7, 5, 4, 2, 1};
//        int index = (searching.binarysearch.practice.BinarySearch.binarySearch(desArr, 10));
//        int index1 = (searching.binarysearch.practice.BinarySearch.descendingBinarySearch(desArr, 12));
//

        int index = AgnosticBinarySearch.agnosticBinarySearch(desArr, 4);
        System.out.println(index);
    }
}
