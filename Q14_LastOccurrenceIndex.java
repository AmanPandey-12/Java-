// Question: Find the index of the last occurrence of a given element.

public class Q14_LastOccurrenceIndex {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 12, 3, 12, 9};
        int target = 12;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nLast occurrence of " + target + " is at index: " + lastIndex);
    }
}
