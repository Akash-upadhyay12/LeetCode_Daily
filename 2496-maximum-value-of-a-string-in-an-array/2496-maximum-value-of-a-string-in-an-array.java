class Solution {
    public int maximumValue(String[] s) {
        int max = 0;
        for (String val : s) {
            if (val.chars().allMatch(Character::isDigit)) {
                max = Math.max(max, Integer.parseInt(val));
            } else {
                max = Math.max(max, val.length());
            }
        }
        return max;
    }
}
