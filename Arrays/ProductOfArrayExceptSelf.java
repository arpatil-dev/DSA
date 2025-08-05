package DSA.Arrays;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int answerLeft[] = new int[nums.length];
        int answerRight[] = new int[nums.length];
        int answers[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            answerLeft[i] = nums[i];
            answerRight[i] = nums[i];
        }
        for(int i=1; i<nums.length; i++)
        {
            answerLeft[(nums.length-1)-i] *= answerLeft[nums.length-i];
            answerRight[i] *= answerRight[i-1];

        }
        for(int i=0; i<nums.length; i++) {
            if(i==0) {
                answers[i] = answerLeft[i+1];
            }else if(i==nums.length-1){
                answers[i] = answerRight[i-1];
            }else{
                answers[i] = answerRight[i-1] *answerLeft[i+1];
            }
        }
       
        return answers;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        System.out.println("Product of Array Except Self: " + Arrays.toString(result));
    }
}
