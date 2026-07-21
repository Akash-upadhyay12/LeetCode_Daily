class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
       int i =0;
       int count = 0;
       while(i<s1.length() && i<s2.length() && i<s3.length()){
        if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i) && s3.charAt(i) == s1.charAt(i)){
            count++;
            i++;
        }
        else{
            break;
        }
    }

    if(count==0){
        return -1;
    }


    else{
        return (s1.length()-count + s2.length()-count + s3.length()-count);
    }





    }
}