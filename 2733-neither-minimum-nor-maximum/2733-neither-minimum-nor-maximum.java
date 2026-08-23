class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int x : nums){
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        for(int x : nums){
            if(x != min && x != max){
                return x;
            }
            
        }
        System.out.println(min);
        System.out.println(max);
        return -1;
        
    }
}