class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] word = s.split(" ");
        for(String w : word){
            char [] arr = w.toCharArray();
            int i = 0;
            int j = arr.length-1;
            while(i<=j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            sb.append(String.valueOf(arr) + " ");
            
        }
        return sb.toString().trim();
    }
}