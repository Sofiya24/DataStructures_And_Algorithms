import java.util.Arrays;

public class RangeInQuery {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};

        int[] preSum = new int[arr.length];

        preSum[0] = arr[0];

        int left = 0, right = 6;

        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(preSum));

        sumRange(preSum, left, right);
    }

    public static void sumRange(int[] preSum, int left, int right) {
        int sum = 0;
        if (left == 0) {
            sum = preSum[right]; 
        } else {
            sum = preSum[right] - preSum[left - 1];
        }
       
        System.out.println(sum);
    }
}