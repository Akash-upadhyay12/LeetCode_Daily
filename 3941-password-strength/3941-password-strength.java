class Solution {
    public int passwordStrength(String s) {

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        int sum = 0;

        for(char ch : set){
            if(Character.isDigit(ch)) sum += 3;
            else if(Character.isLowerCase(ch)) sum += 1;
            else if(Character.isUpperCase(ch)) sum += 2;
            else sum += 5;
        }
        return sum;

        
    }
}