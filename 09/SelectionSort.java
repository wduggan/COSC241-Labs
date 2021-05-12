package week09;

/**
 *  A silly sort implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Iain Hewson
 */
public class SelectionSort extends Sorter {

    /**
     *  Create a new SillySort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public SelectionSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums() {
        // int i, j, comparisons, and nums[] are all protected datafields in
        // the superclass Sort so we can use them without declaring them
        for (i = 0; i < nums.length-1; i++) {
            int minIndex = i;
            for (j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
