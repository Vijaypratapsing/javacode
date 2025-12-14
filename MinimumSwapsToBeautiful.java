import java.util.*;

public class MinimumSwapsToBeautiful {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate minimum swaps for ascending and descending order
        int ascendingSwaps = bubbleSortSwapCount(arr.clone(), false);
        int descendingSwaps = bubbleSortSwapCount(arr.clone(), true);

        // Output the minimum of the two
        System.out.println(Math.min(ascendingSwaps, descendingSwaps));

        scanner.close();
    }

    private static int bubbleSortSwapCount(int[] arr, boolean descending) {
        int swaps = 0;
        int n = arr.length;

        // Bubble sort algorithm with swap counting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare based on order
                if (descending ? arr[j] < arr[j + 1] : arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }
}
