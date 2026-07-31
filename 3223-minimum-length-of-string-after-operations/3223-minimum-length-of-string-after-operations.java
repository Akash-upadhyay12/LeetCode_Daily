class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        int count = 0;
        for(char ch : map.keySet()){
            if(map.get(ch)<3){
                count += map.get(ch);
            }
            else if(map.get(ch)%2 == 0){
                count += 2;
            }
            else{
                count +=1;
            }
        }
        return count;

        
    }
}