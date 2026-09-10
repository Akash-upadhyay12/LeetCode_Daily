class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i<words.length; i++){
            char [] arr = words[i].toCharArray();
            int j = 0;
            int k = arr.length-1;
            while(j<=k){
                if(arr[j] != arr[k]){
                    break;
                }
                j++;
                k--;
            }
            if(j>=k){
                return words[i];
            }
        }
        return "";
        
    }
}