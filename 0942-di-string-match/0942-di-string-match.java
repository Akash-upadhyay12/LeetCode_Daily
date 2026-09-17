class Solution {
    public int[] diStringMatch(String s) {
        int a = 0;
        int b = s.length();
        int [] arr = new int[s.length() + 1];
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                arr[j] = a;
                a++;
            }
            else{
                arr[j] = b;
                b--;
            }
            j++;
        }
        arr[j] = a;
        return arr;
        
    }
}