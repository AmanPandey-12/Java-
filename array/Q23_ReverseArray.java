// Question: Reverse an array in place without using extra space.

public class Q23_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Original array:  ");
        for (int num : arr) System.out.print(num + " ");

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nReversed array:  ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
