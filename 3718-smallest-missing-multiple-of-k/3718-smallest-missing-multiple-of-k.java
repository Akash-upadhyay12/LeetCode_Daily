class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, 1);
        }
        int a = k;
        for(int x : nums){
            if(!map.containsKey(a)){
                return a;
            }
            a += k;
        }
        if(map.containsKey(k*2)){
            return a;
        }
        else{
            return k * 2;
        }

        
    }
}