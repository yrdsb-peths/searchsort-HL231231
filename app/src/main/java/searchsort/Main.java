package searchsort;

/**
 * You can manually test your code here (Optional)
 * Press the 'Play' button or F5 to run the code
 * 
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = Util.shuffle(arr, null);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
