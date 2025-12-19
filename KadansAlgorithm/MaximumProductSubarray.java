public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,0,-1};

       
        // int maxProduct = Integer.MIN_VALUE;

        // for(int i = 0; i < arr.length; i++) {
        //     int product = 1;
        //     for(int j = i; j<arr.length; j++) {
        //         product *= arr[j];
                
        //         if(product > maxProduct) {
        //             maxProduct = product;
        //         }
        //     }
        // }

        // System.out.println(maxProduct);

        int currProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            currProduct *= arr[i];

            if(currProduct < 0){
                currProduct = 1;
            }

            maxProduct = Math.max(maxProduct, currProduct);
        }

        System.out.println(maxProduct);
    }
}
