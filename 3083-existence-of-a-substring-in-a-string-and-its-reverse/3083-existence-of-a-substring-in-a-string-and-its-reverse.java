class Solution {
    public boolean isSubstringPresent(String s) {
        if(s.length()<=1){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        int i = 0;
        int j = 1;
        while(j<s.length()){
            char a = s.charAt(i);
            char b = s.charAt(j);
            String res = "" + a + b; 
            if (sb.toString().contains(res)) {
                 return true;
             }

            i++;
            j++;
        }
        return false;
        
    }
}