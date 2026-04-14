// Question: Shift all elements to the right by one position.

public class Q16_ShiftRight {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");

        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; // wrap around

        System.out.print("\nAfter right shift: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
