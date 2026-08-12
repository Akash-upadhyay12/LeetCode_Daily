class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int ec) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int x : nums){
            if(x>max){
                max = x;
            }
        }
        Collections.fill(list, false);
        for(int i = 0; i<nums.length; i++){
        if(nums[i] + ec >= max){
            list.add(true);
        }
        else{
            list.add(false);
        
        }
        

        }


        System.out.println(max);
        System.out.println(list);
        return list;


        
    }
}