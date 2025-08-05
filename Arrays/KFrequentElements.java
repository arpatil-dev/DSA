package DSA.Arrays;
import java.util.*;
public class KFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println("Frequency Map : " + map);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println("Sorted Frequency List : " + list);
        if (k <= list.size()) {
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = list.get(i).getKey();
            }
            return result;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        KFrequentElements kFrequentElements = new KFrequentElements();
        int[] nums = {0, 1, 3, 0};
        int k = 2;
        int[] result = kFrequentElements.topKFrequent(nums, k);
        System.out.println("Top " + k + " Frequent Elements: " + Arrays.toString(result));
    }

}
