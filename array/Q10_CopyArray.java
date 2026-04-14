// Question: Copy elements from one array to another.

public class Q10_CopyArray {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.print("Source array:      ");
        for (int num : source) System.out.print(num + " ");

        System.out.print("\nDestination array: ");
        for (int num : destination) System.out.print(num + " ");
        System.out.println();
    }
}
