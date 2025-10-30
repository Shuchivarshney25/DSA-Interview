package Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count =0, maxTillYet = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(count == 0){
                maxTillYet = nums[i];
                count++;
            } else if(nums[i] == maxTillYet){
                count++;
            }else {
                count--;
            }

        }
        return maxTillYet;
    }


    public static void main(String[] args) {
        int[] arr ={3,3,4};
        System.out.println(majorityElement(arr));
    }
}
