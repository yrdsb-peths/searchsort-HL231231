package searchsort;

import org.junit.jupiter.api.Test;

public class UtilTest {
    private final Long seed = 12345L;

    @Test
    public void testExch() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        Util.exch(arr1, 0, 1);
        assert arr1[0] == 2;
        assert arr1[1] == 1;
        assert arr1[2] == 3;
        assert arr1[3] == 4;
        assert arr1[4] == 5;
    }

    @Test
    public void testExchSameIndex() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        Util.exch(arr1, 0, 0);
        assert arr1[0] == 1;
        assert arr1[1] == 2;
        assert arr1[2] == 3;
        assert arr1[3] == 4;
        assert arr1[4] == 5;
    }

    @Test
    public void testShuffle() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = Util.shuffle(arr, seed);
        assert result[0] == 1;
        assert result[1] == 2;
        assert result[2] == 3;
        assert result[3] == 4;
        assert result[4] == 5; 
    }

    @Test
    public void testShuffleSameArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = Util.shuffle(arr, seed);
        assert result == arr;
    }

    @Test
    public void testGenerateRandomArray() {
        int[] result = Util.generateRandomArray(5, seed);
        assert result.length == 5;
    }
}
