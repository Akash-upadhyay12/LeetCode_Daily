class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int find = target-arr[i];
            if(map.containsKey(find)){
                return new int[]{i, map.get(find)};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
        
        
    }
}