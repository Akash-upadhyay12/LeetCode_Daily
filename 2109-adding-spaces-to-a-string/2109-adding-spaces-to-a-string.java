class Solution {
    public String addSpaces(String s, int[] sp){
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for(int  i =0; i<sp.length; i++){
            int count = sp[i];
            for(int j = a; j<s.length(); j++){
                if(j == count){
                    sb.append(" ");
                    a = j;
                    break;
                }
                else{
                    sb.append(s.charAt(j));
                }
                
            }
        }
        while(a<s.length()){
            sb.append(s.charAt(a));
            a++;
        }
        return sb.toString();
        
    }
}