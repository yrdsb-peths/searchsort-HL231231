package searchsort;

/**
 * Main class for manually testing your code.
 */
public class Main {
    public static void main(String[] args) {
        Long seed = 12345L;
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = Util.shuffle(arr, seed);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(result[i]);
        }

        // int[] input = Util.generateRandomArray(200000, seed);
        // MergeSort mergeSort = new MergeSort();
        // mergeSort.sort(input);
        // System.out.println(Util.isSorted(input));
    }
}
