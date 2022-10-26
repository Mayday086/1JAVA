import java.util.Arrays;

class InsertionSort {

    // For insertion sort, we have a sorted partition, starting from 1 element,
    // gradually grow while inserting new element into the sorted order in the sorted partition.

    public void insertionSort(int[] intArray) {

        // With the first element at index 0 being the sorted partition, the first unsorted index is 1.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            // Keep track of the element to be inserted later when found to correct position.
            int newElement = intArray[firstUnsortedIndex];
            int i;
            // If the elements in the sorted partition is greater than the element to be inserted,
            // shifted them to the right.
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            // Insert the element into the sorted order.
            intArray[i] = newElement;

            // Optional printout to further understand the insertion sort in action.
            System.out.println("Sorting Array = " + Arrays.toString(intArray));
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] intArray = {20,35,-15,7,55,1,-22};

        System.out.println("Unsorted intArray = " + Arrays.toString(intArray));
        insertionSort.insertionSort(intArray);
        System.out.println("Sorted intArray = " + Arrays.toString(intArray));
    }
}
