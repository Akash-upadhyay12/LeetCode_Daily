class Solution {
    public String defangIPaddr(String s) {
         s = s.replace(".", "[.]");

        // for(int i = 0; i<s.length(); i++){
        //     if(s.charAt(i) != '.'){
        //         continue;

        //     }
        //     else{
        //        s=  s.replace(".", "[.]");
        //     }
            
        // }
        return s;
        
    }
}