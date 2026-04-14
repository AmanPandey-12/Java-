// Question: Rotate an array by k positions to the right.

public class Q24_RotateRight {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original array:           ");
        for (int num : arr) System.out.print(num + " ");

        int n = arr.length;
        k = k % n;

        // Reverse entire array, then reverse first k, then reverse rest
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.print("\nAfter rotating right by " + k + ": ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
