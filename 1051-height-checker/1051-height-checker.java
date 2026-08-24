class Solution {
    public int heightChecker(int[] nums){
        int [] arr = new int[nums.length];
        int i = 0;
        for(int x : nums){
            arr[i] = x;

            i++;
        }
        int c = 0;
        Arrays.sort(arr);
        for(int j = 0; j<arr.length; j++){
            if(arr[j] != nums[j]){
                c++;
            }
        }
        return c;
        
    }
}