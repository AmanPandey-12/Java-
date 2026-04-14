// Question: Separate even and odd elements into two arrays.

public class Q09_SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] evens = new int[evenCount];
        int[] odds  = new int[oddCount];
        int ei = 0, oi = 0;

        for (int num : arr) {
            if (num % 2 == 0) evens[ei++] = num;
            else odds[oi++] = num;
        }

        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");

        System.out.print("\nEven elements: ");
        for (int num : evens) System.out.print(num + " ");

        System.out.print("\nOdd elements:  ");
        for (int num : odds) System.out.print(num + " ");
        System.out.println();
    }
}
