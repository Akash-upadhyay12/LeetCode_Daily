class Solution {
    public String reorderSpaces(String s) {
        int space = 0;
        int t = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                space++;
            }
        }
        String[] w = s.trim().split("\\s+");
        int word = w.length;
        StringBuilder sb = new StringBuilder();
        if(word == 1){
            sb.append(w[0]);
            if(space > 0){
                for(int x = 1; x <= space; x++){
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
        int total = space / (word - 1);
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < w.length; i++){
            sb1.append(w[i]);

            if(i != w.length - 1){
                sb1.append(" ");
            }
        }
        String[] arr = sb1.toString().trim().split("\\s+");
        for(int i = 1; i < arr.length; i++){
            int x = total;
            t = i;
            if(sb.length() == 0){
                sb.append(arr[0]);
            }
            if(space > 0){
                for(int j = 1; j <= x; j++){
                    sb.append(" ");
                    space--;
                }
            }
            if(sb.length() != 0){
                sb.append(arr[i]);
            }
        }
        if(t == arr.length - 1 && space > 0){
            for(int z = 1; z <= space; z++){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}