class Solution {
    public int getLeastFrequentDigit(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        int [] nums = new int[list.size()];
        int k = 0;
        for(int x : list){
            nums[k] = x;
            k++;
        }
        Arrays.sort(nums);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        int min = Integer.MAX_VALUE;
        int count = Integer.MAX_VALUE;
        for(int x : map.keySet()){
            if(map.get(x)<count){
                min = x;
                count = map.get(x);
            }
        }
        return min;


        
    }
}