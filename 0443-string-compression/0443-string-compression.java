class Solution {
    public int compress(char[] arr){
        if(arr.length == 1){
            return 1;
        }
        int count = 1;
        int j = 0;
        for(int i = 1; i <= arr.length; i++){
            if(i < arr.length && arr[i] == arr[i-1]){
                count++;
            }
            else{
                char ch = arr[i-1];
                arr[j] = ch;
                j++;
                if(count > 1){
                    String s = String.valueOf(count);
                    for(char c : s.toCharArray()){
                        arr[j] = c;
                        j++;
                    }
                }
                count = 1;
            }
        }
        return j;
    }
}