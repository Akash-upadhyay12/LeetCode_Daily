class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                int a = Math.abs(j - i);
                if(a <= k && nums[j] == key){
                    list.add(i);
                    break;
                }
            }
        }
        //Collections.sort(list);
        return list;

        
    }
}