class Solution {
    public String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        if(found == false){
            if(s.charAt(0) == '0'){
                sb.append("0");
                if(s.charAt(1) == '?'){
                    sb.append("9");
                }
                else{
                    sb.append(s.charAt(1));
                }
            }
            if(s.charAt(0) == '1'){
                sb.append("1");
                if(s.charAt(1) == '?'){
                    sb.append("1");
                }
                else{
                    sb.append(s.charAt(1));
                }
            }
            if(s.charAt(0) == '?' && s.charAt(1) != '?' && s.charAt(1) <= '1'){
                sb.append("1");
                sb.append(s.charAt(1));
            }
            if(s.charAt(0) == '?' && s.charAt(1) != '?' && s.charAt(1) > '1'){
                sb.append("0");
                sb.append(s.charAt(1));
            }
            if(s.charAt(0) == '?' && s.charAt(1) == '?'){
                sb.append("1");
                sb.append("1");
            }
            found = true;
        }
        sb.append(":");
        if(found){
            if(s.charAt(3) == '?'){
                sb.append("5");
            }
            else{
                sb.append(s.charAt(3));
            }
            if(s.charAt(4) == '?'){
                sb.append("9");
            }
            else{
                sb.append(s.charAt(4));
            }
        }
        return sb.toString();
    }
}