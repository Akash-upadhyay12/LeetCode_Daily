class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int sum = 0;
        HashMap<Character, Integer> ans = new HashMap<>();
        for(char ch : map.keySet()){
            if(Character.isDigit(ch)){
                char digit = (char)('0' + '9' - ch);
                if(!ans.containsKey(digit) && !ans.containsKey(ch)){
                    sum += Math.abs(map.get(ch) - map.getOrDefault(digit, 0));
                    ans.put(ch, 1);
                    ans.put(digit, 1);
                }
            }
            else{
                char m = (char)('a' + 'z' - ch);
                if(!ans.containsKey(m) && !ans.containsKey(ch)){
                    sum += Math.abs(map.get(ch) - map.getOrDefault(m, 0));
                    ans.put(ch, 1);
                    ans.put(m, 1);
                }
            }
            
        }
        return sum;
        
    }
}