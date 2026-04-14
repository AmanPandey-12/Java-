// Question: Find the smallest three elements in an array.

import java.util.Arrays;

public class Q27_SmallestThree {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1, 45, 28};

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");

        // Sort and pick first 3
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        System.out.println("\nSmallest three elements: "
            + sorted[0] + ", " + sorted[1] + ", " + sorted[2]);
    }
}
