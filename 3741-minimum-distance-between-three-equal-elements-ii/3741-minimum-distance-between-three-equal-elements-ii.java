class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for(int x : map.keySet()){
            if(map.get(x) < 3){
                continue; 
            }
            int target = x;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    list.add(i);
                }
            }
            if(list.size() >= 3){
                for(int j = 2; j < list.size(); j++){
                    int a = list.get(j);
                    int b = list.get(j-1);
                    int c = list.get(j-2);
                    int ans = (a - b) + (b - c) + (a - c);
                    min = Math.min(min, ans);
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        else return min;
    }
}
