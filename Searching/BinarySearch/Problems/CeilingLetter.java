package searching.binarysearch.problems;

public class CeilingLetter {

    public static void main(String[] args) {
//        char[] letter = {'a', 'b', 'd', 'f', 'g', 'h', 'j', 'l', 'o', 'p', 's'};
//        char[] letter = {'c', 'f', 'j'};
        char[] letter = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        char result = ceilingOfChar(letter, target);
        System.out.println(result);
    }

    public static char ceilingOfChar(char[] arr ,char target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return arr[0];
        } else if (target == arr[end]) {
            return arr[0];
        }
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return arr[start % arr.length];
    }

    // different approach.
    public static char ceilingOfChar1(char[] arr ,char target) {
        int start = 0;
        int end = arr.length - 1;
        char ceil = arr[0];
        if (target > arr[end]) {
            return arr[0];
        } else if (target == arr[end]) {
            return arr[0];
        }
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (target < arr[middle]) {
                ceil = arr[middle];
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return ceil;
    }

}