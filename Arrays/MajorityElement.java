import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3};
        int n = arr.length/2;
        //Brute Force Approach
        // boolean printed = false;
        //  for (int i = 0; i < arr.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > n && !printed) {
        //         System.out.println(arr[i]);
        //         printed = true;
        //     }
        //  }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int nums : arr) {
            map.put(nums,map.getOrDefault(nums,0)+1);
            if (map.get(nums) > n ) {
                System.out.println(nums);
                break;
            }
        }
    }
}
