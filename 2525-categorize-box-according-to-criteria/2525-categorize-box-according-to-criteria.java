class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;

        if(volume >= 1000000000L || length >= 10000 || width >= 10000 || height >= 10000){
            if(mass >= 100){
                return "Both";
            }
        }
        if(volume >= 1000000000L || length >= 10000 || width >= 10000 || height >= 10000){
            return "Bulky";
        }
        if(mass >= 100){
            return "Heavy";
        }
        else{
            return "Neither";
        }
        
    }
}