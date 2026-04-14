// Question: Count the occurrences of a specific element.

public class Q05_CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 4, 1, 4, 3};
        int target = 4;
        int count = 0;

        for (int num : arr) {
            if (num == target) count++;
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nOccurrences of " + target + ": " + count);
    }
}
