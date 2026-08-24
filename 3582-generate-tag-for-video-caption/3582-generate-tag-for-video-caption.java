class Solution {
    public String generateTag(String s) {
        s = s.trim();
        s = s.toLowerCase();
        String[] w = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        if(s.isEmpty()){
            sb.append("#");
            return sb.toString();
        }
        
        for(int i = 0; i < w.length; i++) {
            char[] arr = w[i].toCharArray();
            if(sb.length() == 0) {
                sb.append("#");
            }
            if(sb.length() == 1) {
                if(Character.isLetter(arr[0])){
                char ch = Character.toLowerCase(arr[0]);
                sb.append(ch);
                }
            }
            if(i >= 1) {
                if(sb.length() < 100) {
                    char ch1 = Character.toUpperCase(arr[0]);
                    sb.append(ch1);
                }
            }
            if(arr.length > 1) {
                for(int k = 1; k < arr.length; k++) {
                    if(sb.length() < 100) {
                        sb.append(arr[k]);
                    }
                }
            }
        }

        return sb.toString();
    }
}