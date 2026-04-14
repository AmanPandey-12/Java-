// Question: Find the union of two arrays.

import java.util.LinkedHashSet;

public class Q38_UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7, 1};

        System.out.print("Array 1: ");
        for (int num : arr1) System.out.print(num + " ");

        System.out.print("\nArray 2: ");
        for (int num : arr2) System.out.print(num + " ");

        LinkedHashSet<Integer> unionSet = new LinkedHashSet<>();
        for (int num : arr1) unionSet.add(num);
        for (int num : arr2) unionSet.add(num);

        System.out.print("\nUnion:   ");
        for (int num : unionSet) System.out.print(num + " ");
        System.out.println();
    }
}
