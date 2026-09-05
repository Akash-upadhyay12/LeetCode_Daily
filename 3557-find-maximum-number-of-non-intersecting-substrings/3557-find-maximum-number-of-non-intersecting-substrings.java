class Solution {
    public int maxSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(i - map.get(ch) + 1 >= 4){
                    count++;
                    map.clear();
                }
            }
            else{
                map.put(ch, i);
            }
            

        }
        return count;
        
    }
}