// Question: Find the second smallest element in an array.

public class Q20_SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSmallest element:        " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
