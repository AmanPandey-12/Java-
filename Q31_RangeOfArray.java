// Question: Find the difference between the largest and smallest element.

public class Q31_RangeOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 18, 3, 42, 11, 27};

        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nLargest element:  " + max);
        System.out.println("Smallest element: " + min);
        System.out.println("Difference (Range): " + (max - min));
    }
}
