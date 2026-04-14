// Question: Find the maximum/minimum element in an array.

public class Q03_MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 5, 67};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
