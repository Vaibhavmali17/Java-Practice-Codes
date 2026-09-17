import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Kitne steps se right rotate karna hai

        int n = arr.length;
        k = k % n; // Agar k length se bada ho

        // Result array
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Rotated by " + k + " steps: " + Arrays.toString(rotated));
    }
}