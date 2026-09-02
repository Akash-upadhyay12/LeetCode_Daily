class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int count = 0;
        for(int x : set){
            if(x < k){
                return -1;
            }
            if(x > k){
                 count++;
            }
        }
        return count;
        
    }
}