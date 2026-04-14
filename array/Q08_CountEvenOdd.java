// Question: Count how many elements are even and how many are odd.

public class Q08_CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nEven count: " + evenCount);
        System.out.println("Odd count:  " + oddCount);
    }
}
