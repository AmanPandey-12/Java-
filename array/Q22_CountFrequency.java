// Question: Count frequency of each element.

import java.util.HashMap;
import java.util.Map;

public class Q22_CountFrequency {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 2, 4, 1, 7};

        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}
