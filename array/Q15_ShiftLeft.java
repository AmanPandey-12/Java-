// Question: Shift all elements to the left by one position.

public class Q15_ShiftLeft {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first; // wrap around

        System.out.print("\nAfter left shift: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
