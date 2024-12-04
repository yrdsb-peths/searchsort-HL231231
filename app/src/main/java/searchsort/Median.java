package searchsort;

public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr.length == 0)
        {
            return 0;
        }
        return 0;
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if(arr.length == 0)
        {
            return 0;
        }
        return 0;
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr){
        if(arr.length == 0)
        {
            return 0;
        }
        InsertionSort sorter = new InsertionSort();
        sorter.sort(arr);
        return arr[(0 + arr.length)/2];
    }

}
