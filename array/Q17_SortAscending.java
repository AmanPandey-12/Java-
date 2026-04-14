// Question: Sort an array in ascending order.

public class Q17_SortAscending {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Before sorting: ");
        for (int num : arr) System.out.print(num + " ");

        // Bubble Sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nAfter sorting (ascending): ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
