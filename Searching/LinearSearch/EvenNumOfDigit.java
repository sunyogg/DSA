package searching.linearsearch;
// QUESTION

public class EvenNumOfDigit {
    public static void main(String[] args) {
        int[] nums = {1, 34, 56, 5675, 234, 590, 23, 56, 232352, 23422};
//        int num = 234;
//        String numStr = Integer.toString(num);
//        System.out.println(numStr.length());
        System.out.println(work(nums));
        System.out.println(optimizedWork(nums));
    }

    public static int work(int[] arr) {
        int counter = 0;
        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            String inStr = Integer.toString(num);
            int result = inStr.length();
            if (result % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public static int optimizedWork(int [] arr) {
        int counter = 0;
        for (int i=0 ; i<arr.length; i++) {
            int anotherCounter = 0;
            while (arr[i] != 0) {
                anotherCounter += 1;
                arr[i]/=10;
            }
            if (anotherCounter % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }
}
