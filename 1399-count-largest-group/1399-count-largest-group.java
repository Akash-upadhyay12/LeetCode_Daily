class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i<=n; i++){
            int sum = 0;
            int x = i;
            while(x>0){
                int digit = x % 10;
                sum += digit;
                x /=10;
            }
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        int max = 0;
        for(int x : map.values()){
            if(x>max){
                max = Math.max(max, x);
            }
        }
        int count = 0;
        for(int x : map.values()){
            if(x == max){
                count++;
            }
        }
        return count;
        
    }
}