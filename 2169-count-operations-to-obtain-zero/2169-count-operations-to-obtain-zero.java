class Solution {
    public int countOperations(int nums1, int nums2){
        if(nums1 == 0 || nums2 == 0){
            return 0;
        }
        int c = 0;
        while(nums1 != 0 && nums2 != 0){
            if(nums1 > nums2){
                nums1 -= nums2;
            }
            else{
                nums2 -= nums1;
            }
            c++;
        }
        return c;

        
    }
}