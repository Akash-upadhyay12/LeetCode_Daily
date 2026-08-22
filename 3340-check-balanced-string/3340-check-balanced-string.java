class Solution {
    public boolean isBalanced(String s) {
        int sumeven = 0;
        int sumodd = 0;
        for(int i = 0; i<s.length(); i+=2){
            char ch = s.charAt(i);
            int a = Integer.parseInt(String.valueOf(ch));
            sumeven += a;
            if(i+1<s.length()){
                char ch1 = s.charAt(i+1);
                int b = Integer.parseInt(String.valueOf(ch1));
                sumodd += b;
            }           
        }
        return sumeven == sumodd ? true : false;
        
    }
}