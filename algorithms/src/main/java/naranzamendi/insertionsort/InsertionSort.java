package naranzamendi.insertionsort;

import java.util.Comparator;

public class InsertionSort {

    public static void sortReversed(int[] numbers) {
        sortWithComparator(numbers, Comparator.reverseOrder());
    }

    public static void sort(int[] numbers) {
        sortWithComparator(numbers, Comparator.naturalOrder());
    }

    private static void sortWithComparator(int[] numbers, Comparator<Integer> comparator) {
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            int val = numbers[j];
            while (j > 0 && comparator.compare(val, numbers[j - 1]) < 0) {
                numbers[j] = numbers[j - 1];
                j = j - 1;
            }
            numbers[j] = val;
        }
    }

}
