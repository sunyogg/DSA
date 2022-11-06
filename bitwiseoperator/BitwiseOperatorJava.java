package bitwiseoperator;

public class BitwiseOperatorJava {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(Integer.toBinaryString(x));
        // Bitwise NOT
        System.out.println(~x);
        // Bitwise AND
        System.out.println(5&3);
        // Bitwise OR
        System.out.println(12|9);
        // Bitwise XOR
        System.out.println(8^10);
        // Bitwise LEFTSHIFT
        System.out.println(5>>1); //   x<<k -> ((x).(2^k))
        // Bitwise RIGHTSHIGT
        System.out.println(5<<1);// x>>k -> (x/(2^k))

        // if we want to find whether at some index of a binary digit is 1 or 0
        // we can do that by:
        // left shifting one to nth index and AND with the given number;
        checkDigit(93, 2);




    }

    // ex: check whether the 5th digit of binary digit of number 13 is 0 or 1.
    public static void checkDigit(int num, int position) {
        int ans = ((num) & (1<<position));
        System.out.println(ans);

    }


}

// if you want to find the find 2^x :
// then shift the number 1 by x;
// ex - 2^8 => 1<<8
