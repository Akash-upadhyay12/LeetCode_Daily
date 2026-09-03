class Solution {
    public int getKth(int lo, int hi, int r) {
        int[] arr = new int[hi + 1 - lo];
        int[] check = new int[hi + 1 - lo];
        int k = 0;
        for (int i = lo; i <= hi; i++) {
            check[k] = i;
            k++;
        }
        int j = 0;
        for (int i = lo; i <= hi; i++) {
            int count = 0;
            int temp = i;
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp /= 2;
                } else {
                    temp = (temp * 3) + 1;
                }
                count++;
            }
            arr[j] = count;
            j++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int p = i + 1; p < arr.length; p++) {
                if (arr[i] > arr[p] ||
                   (arr[i] == arr[p] && check[i] > check[p])) {
                    int temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                    temp = check[i];
                    check[i] = check[p];
                    check[p] = temp;
                }
            }
        }
        return check[r - 1];
    }
}