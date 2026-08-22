class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' && count == 0){
                count++;
            }
            else if(ch == '(' && count != 0){
                sb.append(ch);
                count++;
            }
            else if(ch == ')' && count > 1){
                sb.append(ch);
                count--;
            }
            else{
                count--;
            }


        }
        return sb.toString();
        
    }
}