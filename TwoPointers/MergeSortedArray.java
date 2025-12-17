import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int m = 3;
        int n = 3;
        int[] newArr = new int[m+n];
       
        int p1 = 0, p2 = 0, p = 0;

        // for (int i = 0; i < arr1.length; i++) {
        //     newArr[i] = arr1[i];
        // }

        // for (int i = 0; i < arr2.length; i++) {
        //     newArr[m + i] = arr2[i];
        // }

        // Arrays.sort(newArr);

        // System.out.println(Arrays.toString(newArr));

        while (p1 < m && p2 < n) {
            if (arr1[p1] < arr2[p2]) {
                newArr[p] = arr1[p1];
                p++;
                p1++;
            } else {
                newArr[p] = arr2[p2];
                p++;
                p2++;
            }
        }

        while (p1 < m) {
            newArr[p++] = arr1[p1++];
        }

        while (p2 < n) {
            newArr[p++] = arr2[p2++];
        }

        System.out.println(Arrays.toString(newArr));
    }
}