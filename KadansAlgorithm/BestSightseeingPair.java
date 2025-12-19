public class BestSightseeingPair {
    public static void main(String[] args) {
        int[] nums = {8,1,5,2,6};
        int max = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++) {
        //     int currSum = 0;
        //     for(int j = i+1; j < nums.length; j++) {
        //         currSum = nums[i] + nums[j] + i - j;

        //         max = Math.max(max, currSum);
        //     }
        // }
        // System.out.println(max);

         int maxScore = Integer.MIN_VALUE;
        int maxValue = nums[0] + 0;

        for(int i = 1; i < nums.length; i++) {
            maxScore = Math.max(maxScore, maxValue + nums[i] - i);
            maxValue = Math.max(maxValue, nums[i] + i);
        }

        System.out.println(maxScore);
    }
}
