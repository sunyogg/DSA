package bitwiseoperatorjava;

public class PrimeOrNot {
    public static void main(String[] args) {
//        System.out.println(isPrime(9));
//        System.out.println(isPrime1(7));
        sieve(40);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // i <= sqrt(num);
    // squaring both side
    // i * i <= num;
    public static boolean isPrime1(int num) {
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void sieve(int num) {
        int[] arr = new int[num];
        for (int i = 2; i * i <= num; i++) {
            for (int j = i*i; j < num; j+= i) {
                arr[j] = 1;
            }
        }
        for (int j=2; j<arr.length; j++) {
            if (arr[j] != 1) {
                System.out.println(j);
            }
        }
    }
}