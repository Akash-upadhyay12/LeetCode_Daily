class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> cons = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel.put(ch, vowel.getOrDefault(ch, 0) +1); 
            }
            else{
                cons.put(ch, cons.getOrDefault(ch, 0) +1);
            }
        }
        int max1 = 0;
        for(char ch : vowel.keySet()){
            if(vowel.get(ch)>max1){
                max1 = Math.max(max1, vowel.get(ch));
            }
        }
        int max2 = 0;
        for(char ch : cons.keySet()){
            if(cons.get(ch)>max2){
                max2 = Math.max(max2, cons.get(ch));
            }
        }
        return max1 + max2;
        

        
    }
}