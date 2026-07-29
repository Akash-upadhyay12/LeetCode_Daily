class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(String w : s){
            String [] word = w.split(" ");
            int count = 0;
            for(int i = 0; i<word.length; i++){
                count++;
                max = Math.max(max,count);
            }

        }
        return max;
        
    }
}