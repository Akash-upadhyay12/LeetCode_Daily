class Solution {
    public int maxNumberOfBalloons(String s) {
        int [] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        int count1 =Math.min(freq['b'-'a'], freq['a'-'a']);
        int count2 =Math.min(freq['l'-'a']/2,freq['o'-'a']/2);
        int ans = Math.min(count1,count2);
        int fans = Math.min(ans,freq['n'-'a']);
        return fans;
        

        
    }
}