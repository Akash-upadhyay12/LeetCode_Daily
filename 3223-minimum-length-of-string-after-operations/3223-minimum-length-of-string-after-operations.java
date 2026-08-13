class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        int sum  =0;
        HashSet<Character> set = new HashSet<>();
        for(int  i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        for(char ch : set){
            if(map.get(ch) <=2){
                sum += map.get(ch);
            }
            else if(map.get(ch) > 2 && map.get(ch) % 2 != 0){
                sum += 1;
            }
            else if(map.get(ch) > 2 && map.get(ch) % 2 == 0){
                sum += 2;
            }
        }
        return sum;

        
    }
}