package week09;

/**
 *  A silly sort implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Iain Hewson
 */
public class InsertionSort extends Sorter {

    /**
     *  Create a new SillySort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public InsertionSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums() {
        // int i, j, comparisons, and nums[] are all protected datafields in
        // the superclass Sort so we can use them without declaring them
        for (i = 1; i < nums.length; i++) {
            int key = nums[i];
            for (j = i-1; j >= 0 && nums[j] > key; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = key;
        }
    }
}
