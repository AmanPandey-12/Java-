// Question: Compare two arrays for equality.

public class Q12_CompareArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean equal = (arr1.length == arr2.length);

        if (equal) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.print("Array 1: ");
        for (int num : arr1) System.out.print(num + " ");

        System.out.print("\nArray 2: ");
        for (int num : arr2) System.out.print(num + " ");

        System.out.println("\nArrays are equal: " + equal);
    }
}
