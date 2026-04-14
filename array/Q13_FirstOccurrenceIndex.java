// Question: Find the index of the first occurrence of a given element.

public class Q13_FirstOccurrenceIndex {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 12, 3, 12, 9};
        int target = 12;
        int firstIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIndex = i;
                break;
            }
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nFirst occurrence of " + target + " is at index: " + firstIndex);
    }
}
