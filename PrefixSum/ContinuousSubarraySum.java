import java.util.HashMap;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] num = {23,2,6,4,7};
        int k = 13;
        boolean count = false;

        // for (int i = 0; i < num.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < num.length; j++) {
        //         sum += num[j];
        //         if (j - i > 0 && sum % k == 0) {
        //             count = true;
        //         }
               
        //     }
        // }
        // System.out.println(count);

        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            int rem = sum % k;
            if (rem == 0 && i >= 1) {
                count = true;
            }

            if (modMap.containsKey(rem)) {
                int idx = modMap.get(rem);
                if ((i - idx) >= 2) count =  true;
            } else {
                modMap.put(rem, i);
            }
       }
       System.out.println(count);
    }
}
