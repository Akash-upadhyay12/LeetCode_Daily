class Solution {
    public String largestOddNumber(String s) {
        int max = -1;
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            char ch = s.charAt(i);
            int a = Integer.parseInt(String.valueOf(ch));
            if(a % 2 != 0){
                break;
            }
            i--;
        }
        if(i<0){
            return sb.toString();
        }
        for(int j = 0; j<=i; j++){
            sb.append(s.charAt(j));
        }
        return sb.toString();

        
    }
}