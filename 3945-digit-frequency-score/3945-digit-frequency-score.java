class Solution {
    public int digitFrequencyScore(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n % 10;
            n /= 10;
            list.add(digit);
        }
        int [] arr = new int[list.size()];
        int i = 0;
        for(int x : list){
            arr[i] = x;
            i++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        int sum = 0;

        for(int x : map.keySet()){
            sum += x * map.get(x);

        }
        return sum;
        
    }
}