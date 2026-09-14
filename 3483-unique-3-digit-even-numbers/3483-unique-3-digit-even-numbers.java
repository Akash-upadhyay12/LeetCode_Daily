class Solution {
    public int totalNumbers(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int count = 0;
        for(int i = 100; i < 999; i++){
            HashMap<Integer, Integer> map2 = new HashMap<>();
            if(i % 2 == 0){
                int temp = i;
                while(temp > 0){
                    int digit = temp % 10;
                    map2.put(digit, map2.getOrDefault(digit, 0) + 1);
                    temp /= 10;
                }
                if(!map1.containsKey(i)){
                    boolean possible = true;
                    for(int curr : map2.keySet()) {
                        if(!map.containsKey(curr) || map.get(curr) < map2.get(curr)) {
                            possible = false;
                            break;
                        }
                    }
                    if(possible){
                        count++;
                        map1.put(i, 0);
                    }
                }
            }
        }

        return count;
    }
}