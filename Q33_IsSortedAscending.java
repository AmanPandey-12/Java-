// Question: Check if an array is sorted (ascending).

public class Q33_IsSortedAscending {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 3, 2, 7, 9};

        System.out.print("Array 1: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println("\nIs sorted (ascending)? " + isSorted(arr1));

        System.out.print("\nArray 2: ");
        for (int num : arr2) System.out.print(num + " ");
        System.out.println("\nIs sorted (ascending)? " + isSorted(arr2));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
