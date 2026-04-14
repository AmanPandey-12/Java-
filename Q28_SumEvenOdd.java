// Question: Find the sum of even and sum of odd elements separately.

public class Q28_SumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenSum = 0, oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSum of even elements: " + evenSum);
        System.out.println("Sum of odd elements:  " + oddSum);
    }
}
