// Question: Find the largest three elements in an array.

import java.util.Arrays;

public class Q26_LargestThree {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1, 45, 28};

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");

        // Sort and pick last 3
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int n = sorted.length;

        System.out.println("\nLargest three elements: "
            + sorted[n-1] + ", " + sorted[n-2] + ", " + sorted[n-3]);
    }
}
