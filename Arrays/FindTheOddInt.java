package DSA.Arrays;
public class FindTheOddInt {    
    public static int findIt(int[] a) {
        int res = 0;
        for(int num : a) {
          res ^= num;
        }
        return res;
    }
}
