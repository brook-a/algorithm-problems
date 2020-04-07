/*
  (easy) write an algorithm to determine if a number n is "happy".

  a happy number is a number defined by the following process: Starting with any positive integer,
  replace the number by the sum of the squares of its digits, and repeat the process until the number
  equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. T
  those numbers for which this process ends in 1 are happy numbers.

  return True if n is a happy number, and false if not.
 */

import java.util.HashSet;

public class HappyNumber {
    static boolean isHappy( int n ) {

        HashSet<Integer> seen = new HashSet<>();

        while( n != 1) {
            int curr = n;
            int sum = 0;
            while (curr != 0) {
                sum = (curr % 10) * (curr % 10);
                curr = curr / 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }
}
