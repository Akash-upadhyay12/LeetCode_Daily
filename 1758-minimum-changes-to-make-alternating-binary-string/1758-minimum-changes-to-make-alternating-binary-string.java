class Solution {
    public int minOperations(String s) {
        char ch = s.charAt(0);
        boolean ones = true;
        int count1 = 0;
        if(ch == '1'){
            for(int i = 1; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    if(ones == true){
                        ones = false;
                    }
                    else{
                        count1++;
                        ones = true;
                    }
                }
                else{
                    if(ones ==  true){
                        count1++;
                        ones = false;
                    }
                    else{
                        ones = true;
                    }
                }
            }
        }

        boolean zero = true;
        int count0 = 0;
        if(ch == '0'){
            for(int i = 1; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    if(zero == true){
                        zero = false;
                    }
                    else{
                        count0++;
                        zero = true;
                    }
                }
                else{
                    if(zero ==  true){
                        count0++;
                        zero = false;
                    }
                    else{
                        zero = true;
                    }
                }
            }
        }
        if(ch == '1'){
            return Math.min(count1,  s.length()-count1);
        }
        else if(ch == '0'){
            return Math.min(count0,  s.length()-count0);
        }
        else{
            return -1;
        }
        
        
        
    }
}