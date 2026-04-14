// Question: Rearrange array so that positive and negative numbers alternate.

public class Q36_AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, 3, -9, 7, -1, 2, -4, 6};

        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");

        // Separate positives and negatives
        int n = arr.length;
        int[] pos = new int[n], neg = new int[n];
        int pi = 0, ni = 0;
        for (int num : arr) {
            if (num >= 0) pos[pi++] = num;
            else neg[ni++] = num;
        }

        // Interleave
        int i = 0, j = 0, k = 0;
        boolean posTurn = true;
        while (i < pi && j < ni) {
            if (posTurn) arr[k++] = pos[i++];
            else arr[k++] = neg[j++];
            posTurn = !posTurn;
        }
        while (i < pi) arr[k++] = pos[i++];
        while (j < ni) arr[k++] = neg[j++];

        System.out.print("\nAlternating:  ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
