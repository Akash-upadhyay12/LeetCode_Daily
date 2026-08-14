class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int max = 0;
        for(int j = 0; j < s.length(); j++){
            char chj = s.charAt(j);
            map.put(chj, map.getOrDefault(chj, 0) + 1);
            
            if(map.get(chj) <= 2){; 
            }
            else{
                while(map.get(chj) > 2){
                    char chi = s.charAt(i); 
                    map.put(chi, map.get(chi) - 1);
                    if(map.get(chi) == 0){
                        map.remove(chi);
                    }
                    i++;
                }
            }   
            max = Math.max(max, j - i + 1); 
        }
        return max;
    }
}
