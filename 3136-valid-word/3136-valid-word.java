class Solution {
    public boolean isValid(String s) {
        boolean vc = false;
        boolean cons = false;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                continue;
            }
            else if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vc = true;
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vc = true;
            }
            else if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                cons = true;
            }
        }
        if(vc == true && s.length()>=3 && cons == true){
                return true;
            
      }
      else{
        return false;
      }
    
        

        
    }
}