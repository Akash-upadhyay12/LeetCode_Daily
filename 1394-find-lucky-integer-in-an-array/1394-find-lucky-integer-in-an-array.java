class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ar : arr){
            map.put(ar, map.getOrDefault(ar, 0) +1);
        }
        int ans = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
            ans = Math.max(ans,key);
            }
        }
        return ans;
        
        

        
    }
}