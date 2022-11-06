package searching.binarysearch.problems;

public class StringPalindrome {
    public static void main(String[] args ) {
        String str = "";
        System.out.println(checkPalindrome2(str));

    }

    public static boolean checkPalindrome2(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i=0; i<length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == arr[end]) {
                start +=1;
                end -= 1;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome1(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start += 1;
                end -= 1;
            } else
                return false;
        }
        return true;
    }




}