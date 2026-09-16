class Solution {
    public boolean digitCount(String num) {
        for(int i = 0; i<num.length(); i++){
            int a =  Integer.parseInt(String.valueOf(num.charAt(i)));
            int count = 0;
            for(int j = 0; j<num.length(); j++){
                int b =  Integer.parseInt(String.valueOf(num.charAt(j)));
                if(i == b){
                    count++;
                }
                if(j == num.length()-1 && count != a){
                    return false;
                }
            }
        }
        return true;
            
        }
    }
