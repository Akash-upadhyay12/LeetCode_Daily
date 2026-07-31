class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        int ans = s.length();
        for(char ch : map.keySet()){
            if(map.get(ch)%2 == 0){
                ans -= (map.get(ch)-2);
            }
            else{
                ans -= (map.get(ch)-1);
            }
        }    
            return ans;
            

        
    }
}