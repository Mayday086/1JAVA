import java.util.Arrays;

class MergeSort {

    // Merge Sort is a recursive algorithm. It is logical, so does not create new Array instances.
    // It consists of the splitting and merging phase.
    // Merging phase is not in-place, requiring temporary arrays.
    //
    // As it is recursive, let's think about base case for splitting and merging.
    // For splitting, it will continue to split until achieved an index difference of 1 (index 0-1 = size 1).
    // For merging, it will be called after the splitting is done.
    // It is here in the merging phase where the sorting occurs.

    public void mergeSort(int[] intArray, int start, int end) {
        // Base case for size 1.
        if (end - start == 1)
            return;

        // Recursively split the in two parts, left (from start to mid) and right (from mid to end).
        int mid = start + (end - start) / 2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);

        // Once finish splitting, the merging phase starts.
        merge(intArray, start, mid, end);
    }

    // Method to merge and sort.
    private void merge(int[] intArray, int start, int mid, int end) {
        // If the largest in left is smaller than smallest in right, then no merge needed as it's in sorted order.
        if (intArray[mid-1] <= intArray[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        // While both arrays have elements, continue to arrange into 'temp' in sorted order.
        while (i < mid && j < end)
            temp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];

        // If there are remaining elements in the left array, then need to be copied to the right end,
        // because the remaining elements in the left array is larger than all elements in 'temp'.
        System.arraycopy(intArray, i, intArray, start + tempIndex, mid - i);

        // Then copy the whole 'temp' array into the 'intArray', from the 'start' position.
        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }


    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        int[] intArray = {20,35,-15,7,55,1,-22};

        System.out.println("Unsorted intArray = " + Arrays.toString(intArray));
        mergeSort.mergeSort(intArray, 0, intArray.length);
        System.out.println("Sorted intArray = " + Arrays.toString(intArray));

    }
}
