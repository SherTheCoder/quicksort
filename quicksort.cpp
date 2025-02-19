class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        quickSort(nums, 0, nums.size() - 1);
        return nums;
    }
        void quickSort(vector<int>& nums, int p, int r){
        if(p<r){
            int q = partition(nums, p , r);
            quickSort(nums, p, q-1);
            quickSort(nums, q+1, r);
        }
    }
    int partition(vector<int>& nums, int p, int r){
        int randomPivotIndex = rand()%(r-p) + p;
        swap(nums[randomPivotIndex], nums[r]);
        int x = nums[r];
        int i = p - 1;
        for(int j  = p ; j <= r - 1; j++){
            if(nums[j] <= x){
                i = i+1;
                swap(nums[j], nums[i]);
            }
        }
        swap(nums[i+1], nums[r]);
        return i+1;
    }
}
