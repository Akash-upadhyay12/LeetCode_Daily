class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = nums.length-1; i>=0; i--){
            set.add(nums[i]);
        }
        int [] arr = new int[Math.min(k, set.size())];
        int i = 0;
        for(int x : set){
            if(i == k || i==set.size()){
                break;
            }
            arr[i] = x;
            i++;
        }
        return arr;
        
    }
}