package SlidingWindow;

public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0; int minLength =Integer.MAX_VALUE, sum  = 0;

        while(j <nums.length){
            sum = sum + nums[j];

            while(sum >=target){
                minLength = Math.min(minLength, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
       int target = 7;
       int[] nums = {2,3,1,2,4,3};
       System.out.println(minSubArrayLen(target,nums));
    }
}
