class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<s.length; i++){
            if(!st.isEmpty() && s[i].equals("C")){
                st.pop();
            }
            else if(s[i].equals("D")){
                st.push(2 * st.peek());
            }
             else if (s[i].equals("+")) {
                  st.push(st.peek() + st.get(st.size() - 2));
                  }

            else{
                st.push(Integer.parseInt(s[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.peek();
            st.pop();
            
        }
        return sum;
        
        
    }
}