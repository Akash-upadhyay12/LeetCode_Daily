class Solution {
    public int countDistinctIntegers(int[] nums) {
        int [] arr = new int[2*nums.length];
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            int rev = 0;
            int num = nums[i];
            while(num>0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            arr[k] = rev;
            k++;
            arr[k] = nums[i];
            k++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ar : arr){
            set.add(ar);
        }
        return set.size();
        
        
    }
}