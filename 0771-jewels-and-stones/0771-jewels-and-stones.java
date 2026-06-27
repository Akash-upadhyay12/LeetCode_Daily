class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> set1 = new HashSet<>();

        for(int i = 0; i<j.length(); i++){
            set1.add(j.charAt(i));
        }
        int count = 0;
        for(int i= 0; i<s.length(); i++){
            if(set1.contains(s.charAt(i))){
                count++;
            }
            
        }
        return count;
        
    }
}