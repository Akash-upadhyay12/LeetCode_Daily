class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int pipecount = 0;
        for(int i = 0; i<s.length(); i++){
            if(pipecount == 0 && s.charAt(i) != '|'){
                if(s.charAt(i)=='*'){
                    count++;
                }
                else{
                    continue;
                }
            }
            else if(pipecount<2 && pipecount >=1){
                if(s.charAt(i) == '|'){
                    pipecount++;
                }
                else{
                    continue;
                }
            }
            else if(pipecount>=2 && s.charAt(i) != '|'){
                if(s.charAt(i)=='*'){
                    count++;
                }
                else{
                    continue;
                }
            }
            else{
                pipecount = 1;
            }

        }
        return count;
        
    }
}