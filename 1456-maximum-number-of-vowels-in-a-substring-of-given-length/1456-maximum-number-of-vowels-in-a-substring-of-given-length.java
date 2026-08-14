class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(j - i + 1<=k){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            j++;
        }
        else{
            char  ch1 = s.charAt(i);
            if(ch1 == 'a' || ch1 == 'e' || ch1== 'i' || ch1 == 'o' || ch1 == 'u'){
                count--;
            }
            i++;

        }  
        max = Math.max(max , count);
        
        }
        return max;

    }
}