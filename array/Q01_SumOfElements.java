// Question: Find the sum of all elements in an array.

public class Q01_SumOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSum of all elements: " + sum);
    }
}
