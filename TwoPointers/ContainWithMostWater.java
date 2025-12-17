public class ContainWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                int area = Math.min(arr[i], arr[j] )* (j - i);
                maxArea = Math.max(maxArea, area);
            }

            
        }

        System.out.println(maxArea);
    }
}
