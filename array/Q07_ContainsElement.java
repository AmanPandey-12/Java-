// Question: Check if an array contains a given number.

public class Q07_ContainsElement {
    public static void main(String[] args) {
        int[] arr = {15, 28, 43, 56, 71, 89};
        int target = 56;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nDoes array contain " + target + "? " + (found ? "Yes" : "No"));
    }
}
