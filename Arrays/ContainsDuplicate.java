package DSA.Arrays;
import java.util.*;
class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        if(nums.length > set.size()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(cd.hasDuplicate(nums)); // Output: true
    }
}