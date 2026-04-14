// Question: Move all zeroes to the end without changing order of other elements.

public class Q35_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.print("Before: ");
        for (int num : arr) System.out.print(num + " ");

        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos++] = arr[i];
            }
        }
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }

        System.out.print("\nAfter moving zeroes to end: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
