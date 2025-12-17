import java.util.HashMap;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,11,15, 7};
        int target = 9;

        // for (int i = 0; i< arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] + arr[j] == target) {
        //             System.out.print("( "+ i  + " , " + j + " ) ");
        //             break;
        //         }
        //     }
        // }
        // int left = 0;
        // int right = arr.length - 1;
        // while (left <= right) {
        //     int sum = arr[left] + arr[right];
        //     if (sum == target) {
        //         System.out.println(left + " , " + right );
        //         break;
        //     }else if( sum > target) {
        //         right--;
        //     }
        //     else {
        //         left++;
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int total = target - arr[i];
            if (map.containsKey(total)) {
                System.out.print(map.get(total) + " , " + i);
            } else {
                map.put(arr[i] , i);
            }
        }
    }
}
