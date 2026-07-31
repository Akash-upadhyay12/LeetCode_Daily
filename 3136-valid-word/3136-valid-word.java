class Solution {
    public boolean isValid(String s) {
        int vc = 0;
        int cc = 0;
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
                vc+=1;
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vc+=1;
            }
            else if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                cons = true;
            }
        }
        if(vc>=1 && s.length()>=3 && cons == true){
                return true;
            
      }
      else{
        return false;
      }
    
        

        
    }
}