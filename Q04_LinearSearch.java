// Question: Search for a given element (linear search).

public class Q04_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 12, 35, 18, 90, 42, 7};
        int target = 18;
        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSearching for: " + target);

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
