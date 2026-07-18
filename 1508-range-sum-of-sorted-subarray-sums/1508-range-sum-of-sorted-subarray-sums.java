class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            list.add((long)nums[i]);
            long sum =nums[i];
           for(int j = i+1; j<nums.length; j++){
              sum += nums[j];
              list.add((long)sum);
           }
    }
    Collections.sort(list);
    long sum = 0;
    for(int i = left-1; i<right; i++){
        sum = (sum + list.get(i)) % mod;

    }
    return (int)sum;
        
    }
}