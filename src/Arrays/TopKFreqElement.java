package Arrays;

import java.util.*;

public class TopKFreqElement {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for (int i = 0; i <k ; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums =  {1,2,1,2,1,2,3,1,3,2};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}
