class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, 1);
        }
        int start = -1;
        for(int i = lower; i<=upper; i++){
            if(!map.containsKey(i)){
                if(start == -1){
                    start = i;
                }
            }
            else{
                if(start != -1){
                    cur.add(start);
                    cur.add(i-1);
                    ans.add(new ArrayList<>(cur));
                    cur.clear();
                    start = -1;
                }
            }
        }
        if(start != -1){
            cur.add(start);
            cur.add(upper);
            ans.add(new ArrayList<>(cur));   
        }
        return ans;
        
    }
}