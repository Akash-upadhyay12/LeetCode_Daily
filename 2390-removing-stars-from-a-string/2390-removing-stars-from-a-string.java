class Solution {
    public String removeStars(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
            i++;
        }
        for(char c : st){
            sb.append(c);
        }
        
        return sb.toString();
    }
}