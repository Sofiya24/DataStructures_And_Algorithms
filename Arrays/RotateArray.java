import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int n = arr.length;

        int k = 3;
        //Brute Force
        // for (int i = 0; i < k; i++) {
        //     int previous = arr[arr.length - 1];

        //     for (int j = n - 1; j >0; j--) {
        //         arr[j] = arr[j-1];
        //     }
        //     arr[0] = previous;
        // }

        // System.out.println(Arrays.toString(arr));

        //2nd Approach

        // int rotated[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        //     rotated[(i + k) % n] = arr[i];
        // }

        // System.out.println(Arrays.toString(rotated));
    }
}
