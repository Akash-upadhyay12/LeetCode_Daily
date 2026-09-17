class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i+=2){
            int freq = nums[i];
            for(int j = 0; j<freq; j++){
                list.add(nums[i+1]);
            }
        }    
        int [] arr = new int[list.size()];
        int i = 0;
        for(int x : list){
            arr[i] = x;
            i++;
        }
        return arr;    
    }
}