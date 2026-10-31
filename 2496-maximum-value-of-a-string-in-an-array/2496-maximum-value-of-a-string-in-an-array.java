class Solution {
    public int maximumValue(String[] s){
        int max = 0;
        for(int i = 0; i<s.length; i++){
            String val = s[i];
            if(val == null || val.isEmpty()){
                continue;
            }
            if(val.chars().allMatch(Character::isDigit)){
                int a = Integer.parseInt(String.valueOf(val));
                max = Math.max(max, a);
            }
            else if(val.chars().allMatch(Character::isLetter)){
                max = Math.max(max, val.length());
            }
            else if(val.chars().allMatch(Character::isLetterOrDigit)){
                max = Math.max(max, val.length());
            }
        }
        return max;

        
    }
}