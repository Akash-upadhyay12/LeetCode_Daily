class Solution {
    public String capitalizeTitle(String s) {
         StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
       
        String [] word = s.split(" ");
        for(String wo : word){
            if(wo.length()<=2){
                sb.append(" " + wo );
            }
            else{
                sb.append(" " +Character.toUpperCase(wo.charAt(0)));
            
            for(int i = 1; i<wo.length(); i++){
                    sb.append(wo.charAt(i));
                }
            }
        }
        

        
        return sb.toString().trim();

        
        
        
    }
}