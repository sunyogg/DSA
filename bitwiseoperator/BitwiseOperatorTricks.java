public class BitwiseOperatorTricks {
    public static void main(String[] args) {
        checkNthBit(99, 2);
//        oddOrEven(12);
        int[] arr = {1, 3, 1, 3, 2, 5, 7, 6, 7, 6, 5};
        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toBinaryString((1<<2)));
        magicNumber(3);
    }

    // check whether nth bit in a digit is 0 or 1
    // not working properly, due to incomplete understanding.
    public static void checkNthBit(int num, int position) {
        if (((num) & (1<<position-1)) == 0) {
            System.out.println(1);
            System.out.println(((num) & (1<<position-1)));
        } else if (((num) & (1<<position-1)) == 1) {
            System.out.println(0);
            System.out.println(((num) & (1<<position-1)));
        } else {
            System.out.println("!0 !1");
            System.out.println(((num) & (1<<position-1)));
        }
    }

    // find whether a number is even or odd
    // Only the last bit of a number can tell us whether a number is odd or even.
    // except the last bit, every bit is of form, 2^1, 2^2, 2^3...
    // and we know that the sum of even number is always even, therefore adding 1
    // will determine whether a sum will remain even (when you add 0) or odd (1).
    // that's why here we try to access the last bit of the digit.
    public static void oddOrEven(int num) {
        if ((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    // if an array contains only 1 unique element rest all element has their
    // duplicates. Then How to find that unique element.
    // we know "x XOR x = x"
    // there if XOR whole array then only unique element will be left.
    public static void findUnique(int[] arr) {
        int unique = 0;
        for (int i=0; i<arr.length; i++) {
            unique ^= arr[i];
        }
        System.out.println(unique);
    }
    public static void magicNumber(int num) {
        int ans = 0;
        int base = 5;
        while (num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}