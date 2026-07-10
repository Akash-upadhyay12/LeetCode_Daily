class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] arr1 = new boolean[26];
        boolean[] arr2 = new boolean[26];
        for(int i = 0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                arr2[word.charAt(i) - 'A'] = true;

            }
            else{
                arr1[word.charAt(i) - 'a'] = true;
            }
        }
        int count = 0;

        for(int i = 0; i<26; i++){
        if(arr1[i] && arr2[i] == true){
            count++;
    }
}
return count;

        
    }
}