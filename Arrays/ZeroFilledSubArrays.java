public class ZeroFilledSubArrays {
    public static void main(String[] args) {
        int nums[] = {1,3,0,0,2,0,0,4};

        // Brute Force Approach
        // int n = nums.length;
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i; j < n && nums[j] == 0; j++) {
        //         count++;
        //     }   
        // }
        // System.out.println(count);
        int count = 0; int n = 0;
        for (int i : nums) {
            if (i == 0) {
                n++;
            }else {
                count += (n*(n + 1)) / 2;
                n = 0;
            }
        }
        System.out.println(count);
    }
}
