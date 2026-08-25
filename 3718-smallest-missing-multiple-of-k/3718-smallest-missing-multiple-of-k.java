class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, 1);
        }
        int a = k;
        boolean found = false;
        while(found == false){
            if(!map.containsKey(a)){
                return a;
            }
            a += k;
        }
        return -1;

        
    }
}