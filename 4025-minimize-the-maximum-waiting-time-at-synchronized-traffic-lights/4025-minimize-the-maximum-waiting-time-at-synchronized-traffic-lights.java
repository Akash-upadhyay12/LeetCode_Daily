class Solution {
    public int minPenalty(int period, int[] li, int[] at){
        Arrays.sort(li);
        int j = li.length-1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<at.length; i++){
            int ans = at[i] % period;
            if(ans < li[j]){
                sum += 0;
            }
            else{
                sum = period - ans; 
            }
            max = Math.max(max, sum);
        }
        return max;
        
    }
}