class Solution {
    public String toGoatLatin(String s){
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int y = 1;
        for(String w : words){
            char [] arr = w.toCharArray();
            if(arr[0] == 'a' || arr[0] == 'e' || arr[0] == 'i' || arr[0] == 'o' || arr[0] == 'u'||arr[0] == 'A' || arr[0] == 'E' || arr[0] == 'I' || arr[0] == 'O' || arr[0] == 'U'){
                for(int i = 0; i<arr.length; i++){
                    sb.append(arr[i]);
                }
                sb.append("m");
                for(int z = 0; z<=y; z++){
                    sb.append("a");
                }
                sb.append(" ");
            }
            else if(arr[0] != 'a' || arr[0] != 'e' || arr[0] != 'i' || arr[0] != 'o' || arr[0] != 'u'||arr[0] == 'A' || arr[0] == 'E' || arr[0] == 'I' || arr[0] == 'O' || arr[0] == 'U'){
                char x = arr[0];
                for(int i = 1; i<arr.length; i++){
                    sb.append(arr[i]);
                }
                sb.append(x);
                sb.append("m");
                for(int z = 0; z<=y; z++){
                    sb.append("a");
                }
                sb.append(" ");
            }
            y++;
        }
        return sb.toString().trim();
        
    }
}