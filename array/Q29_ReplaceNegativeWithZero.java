// Question: Replace negative numbers with zero.

public class Q29_ReplaceNegativeWithZero {
    public static void main(String[] args) {
        int[] arr = {3, -1, -4, 7, -9, 5, -2, 8};

        System.out.print("Before: ");
        for (int num : arr) System.out.print(num + " ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }

        System.out.print("\nAfter replacing negatives with zero: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
