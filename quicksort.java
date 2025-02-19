import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sortArray(List<Integer> nums) {
        quickSort(nums, 0, nums.size() - 1);
        return nums;
    }
    
    private void quickSort(List<Integer> nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }
    
    private int partition(List<Integer> nums, int low, int high) {
        int pivotElement = nums.get(r);
        int i = low - 1;
        for (int j = p; j <= r - 1; j++) {
            if (nums.get(j) <= pivotElement) {
                i = i + 1;
                Collections.swap(nums, j, i);
            }
        }
        Collections.swap(nums, i + 1, r);
        return i + 1;
    }
}
