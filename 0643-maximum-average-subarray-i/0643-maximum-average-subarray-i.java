class Solution {
    public double findMaxAverage(int[] nums, int k) {
         float max  = 0;
        float sum = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];

            if(i - j +1 == k){
             float ans = sum / k;
                max = Math.max(max, ans);
                sum -= nums[j];
                j++;
            }

        }
        return max;
        
    }
}
// }
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//           int i = 0;
//         float max = 0;
//         float sum = 0;
        
//         for(int j = 0; j<nums.length; j++){
//             sum += nums[j];
            
//             if(j-i+1 ==k){
//                 float sum2 = sum / k;
//                 max = Math.max(max, sum2);
//                 sum -= nums[i];
//                 i++;
//             }
            
//         }
//         return max;
        
//     }
// }