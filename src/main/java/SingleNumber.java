
/*
    (easy) : given a non-empty array of integers, every element appears twice except
    for one. find that single one.
 */

import java.util.ArrayList;
import java.util.List;
public class SingleNumber {

    static int singleNumber(int[] nums) {
        List<Integer> no_dups = new ArrayList<>();
        for (int n : nums) {
            if (!no_dups.contains(n)) {
                no_dups.add(n);
            } else {
                no_dups.remove( Integer.valueOf(n) );
            }
        }
       return no_dups.get(0);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.printf("%d", singleNumber(nums));
    }
}
