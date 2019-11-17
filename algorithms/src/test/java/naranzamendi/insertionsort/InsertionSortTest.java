package naranzamendi.insertionsort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest {

    @Test
    public void sortsNumbers() {
        int[] numbers = new int[]{5, 1, 6, 4, 2, 11, 9};
        InsertionSort.sort(numbers);
        assertThat(numbers).isEqualTo(new int[]{1, 2, 4, 5, 6, 9, 11});
    }

    @Test
    public void sortsNumbersReversed() {
        int[] numbers = new int[]{5, 1, 6, 4, 2, 11, 9};
        InsertionSort.sortReversed(numbers);
        assertThat(numbers).isEqualTo(new int[]{11, 9, 6, 5, 4, 2, 1});
    }

}
