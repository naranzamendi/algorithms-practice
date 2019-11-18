package naranzamendi.mergesort;

public class MergeSort {

    public static void sort(int[] numbers) {
        int p = 0;
        int r = numbers.length - 1;

        mergeSort(numbers, p, r);
    }

    private static void mergeSort(int[] numbers, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(numbers, p, q);
            mergeSort(numbers, q + 1, r);
            merge(numbers, p, q, r);
        }

    }

    static void merge(int[] numbers, int p, int q, int r) {

        int[] left = createSubArray(numbers, p, q);
        int[] right = createSubArray(numbers, q + 1, r);

        int n = 0;
        int m = 0;

        for (int i = p; i <= r; i++) {
            if (left[n] < right[m]) {
                numbers[i] = left[n];
                n++;
            } else {
                numbers[i] = right[m];
                m++;
            }
        }

    }

    public static int[] createSubArray(int[] numbers, int a, int b) {
        int size = b - a + 2;
        int[] subArray = new int[size];
        for (int i = a; i <= b; i++)
            subArray[i - a] = numbers[i];
        subArray[size - 1] = Integer.MAX_VALUE;
        return subArray;
    }
}
