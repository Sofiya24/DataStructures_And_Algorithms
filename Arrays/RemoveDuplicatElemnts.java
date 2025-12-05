import java.util.Arrays;

public class RemoveDuplicatElemnts {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        // Brute Force Approach
        int uniqueArr[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                uniqueArr[j++] = arr[i];
            }
        }

        uniqueArr[j] = arr[arr.length-1];

        System.out.println(Arrays.toString(uniqueArr));
    }
}
