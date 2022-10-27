import java.util.Arrays;

class QuickSort {

    // Quick Sort is a recursive algorithm. It is logical, so does not create new Array instances.
    // It uses a pivot element in the centre,
    // which sort the elements to the left if the elements are smaller than the pivot,
    // and to the right if the elements are greater than the pivot.

    public void quickSort(int[] intArray, int start, int end) {
        // If there is only 1 element, not need to sort.
        if (end - start < 2)
            return;

        int pivotIndex = partition(intArray, start, end);

        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex + 1, end);
    }

    private int partition(int[] intArray, int start, int end) {
        // Using first element as pivot.
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while (i < j) {
            // The empty while loop for the right section,
            // continue to move 'j' pointer until we found an element less than the pivot.
            while (i < j && intArray[--j] >= pivot);
            // Place the lesser element to the left ('i' index).
            if (i < j)
                intArray[i] = intArray[j];

            // The empty while loop for the left section,
            // continue to move 'i' pointer until we found an element greater than the pivot.
            while (i < j && intArray[++i] <= pivot);
            // Place the greater element to the right ('j' index).
            if (i < j)
                intArray[j] = intArray[i];
        }
        // Once both pointers meet, we can place the pivot in the center of both sections.
        // It is this pivot point, index 'i',
        // which serves as the 'start' and 'end' for the right and left segments respectively,
        // when we further sort the segments.
        intArray[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] intArray = {20,35,-15,7,55,1,-22};

        System.out.println("Unsorted intArray = " + Arrays.toString(intArray));
        quickSort.quickSort(intArray, 0, intArray.length);
        System.out.println("Sorted intArray = " + Arrays.toString(intArray));
    }
}
