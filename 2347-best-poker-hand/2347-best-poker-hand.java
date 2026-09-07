class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char x : suits){
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for(char x : map1.keySet()){
            if(map1.get(x) == suits.length){
                return "Flush";
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : ranks){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(int x : map.keySet()){
            if(map.get(x) >= 3){
                return "Three of a Kind";
            }
        }
        for(int x : map.keySet()){
            if(map.get(x) == 2){
                return "Pair";
            }
        }
        for(int x : map.keySet()){
            if(map.get(x) >= 1){
                return "High Card";
            }
        }
        return "A";
        
    }
}