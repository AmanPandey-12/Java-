// Question: Find all pairs of elements whose sum is equal to a given number.

public class Q32_PairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 9;

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nPairs with sum = " + target + ":");

        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("  (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) System.out.println("  No pairs found.");
    }
}
