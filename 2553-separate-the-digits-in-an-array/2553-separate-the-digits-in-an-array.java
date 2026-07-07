class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i>=0; i--){
            while(nums[i]>0){
                int digit = nums[i]%10;
                list.add(digit);
                nums[i] /= 10;
            }
            
        }
        Collections.reverse(list);
        int [] arr = new int[list.size()];
        int i = 0;

        for(int x : list){
            arr[i] = x;
            i++;
        }
        return arr;
        
    }
}