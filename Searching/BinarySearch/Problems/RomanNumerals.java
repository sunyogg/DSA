package searching.binarysearch.problems;

public class RomanNumerals {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInteger(roman));
    }

    public static long romanToInteger(String roman) {
        long counter = 0;
        for (int i=0; i<roman.length(); i++) {

            if (roman.charAt(i) == 'I') {
                if (i == roman.length() - 1) {
                    counter += 1;
                    continue;
                }
                if (roman.charAt(i + 1) == 'V') {
                    counter += 4;
                    i++;
                } else if (roman.charAt(i + 1) == 'X') {
                    counter += 9;
                    i++;
                } else {
                    counter += 1;
                }

            } else if (roman.charAt(i) == 'V') {
                counter += 5;

            } else if (roman.charAt(i) == 'X') {
                if (i == roman.length() - 1) {
                    counter += 10;
                    continue;
                }
                if (roman.charAt(i + 1) == 'L') {
                    counter += 40;
                    i++;
                } else if (roman.charAt(i + 1) == 'C') {
                    counter += 90;
                    i++;
                } else {
                    counter += 10;
                }

            } else if (roman.charAt(i) == 'L') {
                counter += 50;

            } else if (roman.charAt(i) == 'C') {
                if (i == roman.length() - 1) {
                    counter += 100;
                    continue;
                }
                if (roman.charAt(i + 1) == 'D') {
                    counter += 400;
                    i++;
                } else if (roman.charAt(i + 1) == 'M') {
                    counter += 900;
                    i++;
                } else {
                    counter += 100;
                }

            } else if (roman.charAt(i) == 'D') {
                counter += 500;

            } else if (roman.charAt(i) == 'M') {
                counter += 1000;
            }
        }
        return counter;
    }

}