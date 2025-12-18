import java.util.HashMap;

public class SubArraySumEqualK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        int count = 0;
        int currSum = 0;

    //    for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
        
    //         for (int j = i; j < arr.length; j++) {
    //             sum = sum + arr[j];
    //             if (sum == k) {
    //                 count++;
    //             }
    //         }
    //    }

    //    System.out.println(count);

      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);

        for (int nums : arr) {
            currSum += nums;
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            } 
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        System.out.println(count);
    }
}
