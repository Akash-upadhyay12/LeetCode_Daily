class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++){
            list.add(nums[i]);
            int sum = 0;
            for(int j = i+1; j<nums.length; j++){
                list.add(nums[j] + list.get(list.size()-1));
                if(i == nums.length-2){
                    list.add(nums[j]);
                }
            }
        }
        Collections.sort(list);
        long fans = 0;
        for(int i = left-1; i<right; i++){
            fans = (fans + list.get(i)) % mod;

        }

        System.out.println(list);
        return (int)fans;
        
    }
}