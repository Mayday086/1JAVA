import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class BucketSort {
    public void bucketSort(int[] intArray) {

        List<Integer>[] buckets = new List[10];

        // Initialize buckets with List (either linkedList or arrayList).
        for (int i = 0; i < buckets.length; i++)
            buckets[i] = new ArrayList<>();

        // Record the hashed integers into the buckets.
        for (int integer: intArray)
            buckets[hash(integer)].add(integer);

        // Sort the items in each bucket.
        for (List<Integer> bucket: buckets)
            Collections.sort(bucket);

        // Concatenate all the integers in ascending order.
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {
                intArray[j++] = value;
            }
        }
    }

    private int hash(int value) {
        return (value / 10) % 10;
    }

    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        System.out.println("Unsorted intArray = " + Arrays.toString(intArray));
        bucketSort.bucketSort(intArray);
        System.out.println("Sorted intArray = " + Arrays.toString(intArray));
    }
}
