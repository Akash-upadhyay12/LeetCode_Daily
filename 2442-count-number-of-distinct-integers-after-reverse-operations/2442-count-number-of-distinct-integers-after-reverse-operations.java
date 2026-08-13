class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                count++;
            }
            int rev = 0;
            int y = nums[i];
            while(y>0){
                int digit = y % 10;
                rev = rev * 10 + digit;
                y /=10;
            }
            if(!map.containsKey(rev)){
                count++;
            }
            map.put(rev, i);
        }
        return count;

        
    }
}