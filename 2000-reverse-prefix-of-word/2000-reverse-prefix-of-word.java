class Solution {
    public String reversePrefix(String wo, char ch) {
         StringBuilder sb = new StringBuilder();
        int j = 0;
        while(j<wo.length()){
            if(wo.charAt(j) != ch){
                sb.append(wo.charAt(j));
                j++;

            }
            else{
                sb.append(wo.charAt(j));
                sb.reverse();
                j++;
                break;
           }

        }
        while(j<wo.length()){
            sb.append(wo.charAt(j));
            j++;
        }
        
        return sb.toString();


        
    }
}