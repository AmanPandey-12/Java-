// Question: Find missing number in a sequence from 1 to n.

public class Q39_FindMissingNumber {
    public static void main(String[] args) {
        // Array contains n-1 numbers from 1 to n with one missing
        int[] arr = {1, 2, 4, 5, 6};  // n = 6, missing = 3
        int n = arr.length + 1;

        // Expected sum = n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;

        System.out.print("Array (1 to " + n + " with one missing): ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nMissing number: " + (expectedSum - actualSum));
    }
}
