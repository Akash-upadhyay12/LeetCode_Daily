class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        int i = 0;
        int [] arr = new int[2];
        int k = 0;
        
        int min = Integer.MAX_VALUE;
        while(i<nums1.length && j <nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else if(nums1[i] > nums2[j]){
                arr[0] = nums2[j];
                arr[1] = nums1[i];
                j++;
            }
            else{
                arr[0] = nums1[i];
                arr[1] = nums2[j];
                i++;
            }
            int num = 0;
            
            for(int l = 0; l<arr.length; l++){
                num = num*10 + arr[l];
            }
            min = Math.min(min, num);
            
        }
        return min;
        
    }
}