class Solution {
    public String compressedString(String s) {
        StringBuilder sb = new StringBuilder();

        if (s.length() == 1) {
            sb.append("1");
            sb.append(s.charAt(0));
            return sb.toString();
        }

        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                if (count <= 9) {
                    sb.append(count);
                    sb.append(s.charAt(i - 1));
                }
                else {
                    while (count >= 9) {
                        sb.append("9");
                        sb.append(s.charAt(i - 1));
                        count -= 9;
                    }

                    if (count > 0) {
                        sb.append(count);
                        sb.append(s.charAt(i - 1));
                    }
                }

                count = 1;
            }

            if (i == s.length() - 1) {

                if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {

                    while (count >= 9) {
                        sb.append("9");
                        sb.append(s.charAt(i - 1));
                        count -= 9;
                    }

                    if (count > 0) {
                        sb.append(count);
                        sb.append(s.charAt(i - 1));
                    }
                }
                else {
                    sb.append("1");
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.toString();
    }
}