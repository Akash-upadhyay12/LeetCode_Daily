class Solution {
    public String restoreString(String s, int[] nums) {
        String [] arr = new String[nums.length];
        char [] ans = s.toCharArray();
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]] = String.valueOf(ans[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length; i++){
            sb.append(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        return sb.toString();
        
    }
}