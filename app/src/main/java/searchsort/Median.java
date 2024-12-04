package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr.length == 0)
        {
            return 0;
        }
        QuickSort sorter = new QuickSort();
        sorter.sort(arr);
        return arr[(0 + arr.length)/2];
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if(arr.length == 0)
        {
            return 0;
        }
        MergeSort sorter = new MergeSort();
        sorter.sort(arr);
        return arr[(0 + arr.length)/2];
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr){
        if(arr.length == 0)
        {
            return 0;
        }
        InsertionSort.sort(arr);
        return arr[(0 + arr.length)/2];
    }

}
