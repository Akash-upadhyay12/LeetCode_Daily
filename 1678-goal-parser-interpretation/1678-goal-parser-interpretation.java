class Solution {
    public String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                sb.append("o");
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1) == 'a'){
                sb.append("al");
                i+=2;
            }
        }
        return sb.toString();
        
    }
}