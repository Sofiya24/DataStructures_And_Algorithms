import java.util.Arrays;

public class MoveZeros {
    public static void main(String args[]) {

        // Brute Force approach
        // int arr[] = {0};
        // int newArr[] = new int[arr.length];
        // int j = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != 0) {
        //         newArr[j++] = arr[i];
        //     } 
        // }

        // System.out.println(Arrays.toString(newArr));


        // two pointers approach

        int arr[] = {0};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}