package searchsort;

/**
 * You can manually test your code here (Optional)
 * Press the 'Play' button or F5 to run the code
 * 
 */
public class Main {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5};
        BinarySearch search = new BinarySearch();
        System.out.println(search.find(testArr, 3));
    }
}
