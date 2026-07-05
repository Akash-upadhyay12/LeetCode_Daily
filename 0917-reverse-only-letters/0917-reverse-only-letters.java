class Solution {
    public String reverseOnlyLetters(String s) {
        char [] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(!Character.isLetter(arr[i]) || Character.isDigit(arr[i])){
                i++;
                continue;

            }
             if(!Character.isLetter(arr[j]) || Character.isDigit(arr[j])){
                j--;
                continue;
                
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            


        }
        String a = String.valueOf(arr);
        return a;
        
    }
}