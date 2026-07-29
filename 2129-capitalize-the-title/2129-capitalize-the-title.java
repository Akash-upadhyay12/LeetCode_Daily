class Solution {
    public String capitalizeTitle(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        String [] word = s.split(" ");
        for(String w : word){
            if(w.length()<=2){
                sb.append(String.valueOf(w));
            }
            else{
                sb.append(Character.toUpperCase(w.charAt(0)));
                for(int i = 1; i<w.length(); i++){
                    sb.append(w.charAt(i));
                }

            }
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}