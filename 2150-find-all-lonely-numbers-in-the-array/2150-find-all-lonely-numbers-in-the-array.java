class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Integer r : map.keySet()){
            if(map.get(r) == 1 && !map.containsKey(r-1) && !map.containsKey(r+1)){
                list.add(r);

            }
        }
        return list;
        
        
        
    }
}