// Question: Replace all zeroes with ones.

public class Q30_ReplaceZeroWithOne {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 8, 0, 2};

        System.out.print("Before: ");
        for (int num : arr) System.out.print(num + " ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
        }

        System.out.print("\nAfter replacing zeroes with ones: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
