class Solution {
    public String resultingString(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch == 'a'&& st.peek() == 'z'){
                st.pop();
            }
            else if(!st.isEmpty() && ch == 'z'&& st.peek() == 'a'){
                st.pop();
            }
            else{
                int a = st.peek() - 'a' + 1;
                int b = ch - 'a' + 1;
                if(!st.isEmpty() && Math.abs(a - b) == 1){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        System.out.println(st.size());
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();



        
    }
}