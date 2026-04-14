// Question: Replace all occurrences of a specific element with another number.

public class Q06_ReplaceElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 5, 3, 9, 3};
        int oldVal = 3;
        int newVal = 99;

        System.out.println("Array before replacement: ");
        for (int num : arr) System.out.print(num + " ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) arr[i] = newVal;
        }

        System.out.println("\nArray after replacing " + oldVal + " with " + newVal + ": ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
