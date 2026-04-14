// Question: Count the number of elements greater than a given number.

public class Q34_CountGreaterThan {
    public static void main(String[] args) {
        int[] arr = {3, 15, 8, 22, 5, 17, 11, 30};
        int threshold = 10;
        int count = 0;

        for (int num : arr) {
            if (num > threshold) count++;
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nElements greater than " + threshold + ": " + count);
    }
}
