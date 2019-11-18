package naranzamendi.mergesort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {


    @Test
    public void sortsNumbers() {
        int[] numbers = new int[]{5, 1, 6, 4, 2, 11, 9};
        MergeSort.sort(numbers);
        assertThat(numbers).isEqualTo(new int[]{1, 2, 4, 5, 6, 9, 11});
    }
}