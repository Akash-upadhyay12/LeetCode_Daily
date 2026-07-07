class Solution {
    public String greatestLetter(String s) {
        boolean [] arr1 = new boolean[26];
        boolean [] arr2 = new boolean[26];
        for(int i = 0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                arr1[s.charAt(i)-'A'] = true;
            }
            else{
                arr2[s.charAt(i)-'a'] = true;
            }
        }
        for(int i = 25; i>=0; i--){
            if(arr1[i] && arr2[i] == true){
                char ch = (char)(i + 'A');
                String t = String.valueOf(ch);
                return t;

            }
        }
        return "";
        
    }
}