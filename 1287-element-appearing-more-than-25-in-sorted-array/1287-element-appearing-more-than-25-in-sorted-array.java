class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        int n = arr.length/4;
        for(int x : map.keySet()){
            if(map.get(x)>n){
                return x;
            }
        }
        return -1;
        
    }
}