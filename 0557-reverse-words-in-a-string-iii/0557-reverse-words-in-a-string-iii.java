class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] word = s.split(" ");

        for(String wo : word){
            char [] arr = wo.toCharArray();
            int i = 0;
            int j = arr.length-1;
            while(i<=j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            i++;
            j--;
            }
            String rev = new String(arr);
            sb.append(rev + " ");
            
        }
        return sb.toString().trim();
        

        
    }
}