// Question: Find the intersection of two arrays.

import java.util.HashSet;

public class Q37_IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7, 1};

        System.out.print("Array 1: ");
        for (int num : arr1) System.out.print(num + " ");

        System.out.print("\nArray 2: ");
        for (int num : arr2) System.out.print(num + " ");

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);

        System.out.print("\nIntersection: ");
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num) && seen.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
