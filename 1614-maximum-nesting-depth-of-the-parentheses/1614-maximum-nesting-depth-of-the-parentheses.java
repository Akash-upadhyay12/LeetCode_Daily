class Solution {
    public int maxDepth(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        int count = 0;
        int max = 0;

        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                i++;
                continue;
            }

            if(s.charAt(i) == '('){
                st.push(String.valueOf(s.charAt(i)));
                count++;
                max = Math.max(max, count);
            }
            else if(!st.isEmpty() && s.charAt(i) == ')'){
                st.pop();
                count--;
            }
            i++;

        }
        return max;
        
    }
}