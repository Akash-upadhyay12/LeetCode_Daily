class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int j = i;
            int l = Math.min(i + k - 1, arr.length - 1);

            while (j < l) {
                char temp = arr[j];
                arr[j] = arr[l];
                arr[l] = temp;
                l--; // swapped l variable update
                j++;
            }
        }
        

    
        return new String(arr);
    }
}