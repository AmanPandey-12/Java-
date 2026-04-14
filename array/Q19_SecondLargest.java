// Question: Find the second largest element in an array.

public class Q19_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nLargest element:        " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
