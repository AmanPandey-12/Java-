// Question: Remove duplicates from an array.

import java.util.LinkedHashSet;

public class Q21_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};

        System.out.print("Original array:   ");
        for (int num : arr) System.out.print(num + " ");

        // Using LinkedHashSet to preserve order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);

        System.out.print("\nAfter removing duplicates: ");
        for (int num : set) System.out.print(num + " ");
        System.out.println();
    }
}
