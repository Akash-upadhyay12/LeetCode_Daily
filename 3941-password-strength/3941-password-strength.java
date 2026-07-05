class Solution {
    public int passwordStrength(String p) {
        HashSet<Character> set = new HashSet<>();
        int r = 0;
        for(int i = 0; i<p.length(); i++){
            set.add(p.charAt(i));
        }
        for(char ch : set){
            if(Character.isLowerCase(ch)){
                r +=1;
            }
           else if(Character.isUpperCase(ch)){
                r +=2;
            }
            else if(!Character.isLetterOrDigit(ch)){
                r += 5;;
            }
            else{
                r += 3;
            }
        }

        
        return r;
        
    }
}