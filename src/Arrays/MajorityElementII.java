package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i <nums.length; i++) {
            if(!countMap.containsKey(nums[i])){
                countMap.put(nums[i], 1);
            }else {
                countMap.put(nums[i], countMap.get(nums[i])+1);
            }
        }

        List<Integer> majorityElementsList = new ArrayList<>();
        int threshold = nums.length / 3;

        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
            int numCount = entry.getValue();
            if(numCount > threshold){
                majorityElementsList.add(entry.getKey());
            }
        }
        return majorityElementsList;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(majorityElement(arr));
    }
}
