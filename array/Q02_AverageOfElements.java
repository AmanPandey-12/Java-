// Question: Find the average of array elements.

public class Q02_AverageOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nSum: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
