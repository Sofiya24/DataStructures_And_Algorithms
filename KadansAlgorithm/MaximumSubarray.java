public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         int sum = 0;
        //         for (int j2 = i; j2 <= j; j2++) {
        //             sum += nums[j2];
        //         }
        //         if (sum > maxSum) {
        //             maxSum = sum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        // for (int i = 0; i < nums.length; i++) {
        //     int currSum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         currSum += nums[j];
        //         if (currSum > maxSum) {
        //             maxSum = currSum;
        //         }
        //     }
           
        // }
        // System.out.println(maxSum);

        int currSum = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}