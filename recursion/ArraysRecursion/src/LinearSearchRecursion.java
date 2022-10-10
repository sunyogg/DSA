import java.util.ArrayList;

public class LinearSearchRecursion {

    public static ArrayList<Integer> ans = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 4, 9, 7, 4};
        int start = 0;
        int end =  arr.length - 1;
        ArrayList<Integer> list = searchDuplicateRecursion2(arr, 4, start);

        System.out.println(list);
    }


    // But is it possible to still return the list and pass it in the argument
    // In other words creating the list inside the recursive method but making
    // sure that the new object is not creating with every recursive call and
    // we are working with the same list, that was created in the first recursive
    // call. Is that possible?
    public static ArrayList<Integer> searchDuplicateRecursion2(int[] arr, int target,
                                                      int i) {
        ArrayList<Integer> nums = new ArrayList<>();
        if (i == arr.length) {
            return nums;
        }
        ArrayList<Integer> supp = new ArrayList<>();
        if (arr[i] == target ) {
            nums.add(i);
        }
        supp =  searchDuplicateRecursion2(arr, target, ++i);
        nums.addAll(supp);
        return nums;
    }


    public static ArrayList searchDuplicateRecursion1(int[] arr, int target,
                                                     ArrayList list, int i) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return searchDuplicateRecursion1(arr, target, list, ++i);
    }

    public static void searchDuplicateRecursion(
                                        int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        searchDuplicateRecursion(arr, target, ++i);
    }

    public static boolean anotherSearchRecursion(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return  (arr[i] == target || anotherSearchRecursion(arr, target, ++i));
    }

    // is it better?
    public static int betterSearchRecursion(int[] arr, int target,
                                             int start, int end) {
        if (start >= end) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        } else if (arr[end] == target) {
            return end;
        } else {
            return betterSearchRecursion(arr, target, ++start, --end);
        }
    }

    public static int searchRecursion(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return searchRecursion(arr, target, ++i);
    }
}