class Solution {
    public String reverseByType(String s) {
        char [] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            char ch = arr[i];
            char ch2 = arr[j];
            if(!Character.isLetterOrDigit(ch)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)){
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
        int a = 0;
        int b = arr.length-1;
        while(a<=b){
            char ch = arr[a];
            char ch2 = arr[b];
            if(Character.isLetterOrDigit(ch)){
                a++;
                continue;
            }
            if(Character.isLetterOrDigit(ch2)){
                b--;
                continue;
            }
            else{
                char temp = arr[a];
                arr[a] = arr[b];
                 arr[b] = temp;
                 a++;
                 b--;
            }
        }
        String w = new String(arr);
        return w;
        
    }
}