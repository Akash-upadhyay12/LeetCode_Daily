class Solution {
    public int countValidWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            char[] nums = arr[i].toCharArray();

            boolean punch = false;
            boolean hyphen = false;
            boolean valid = true;

            for(int j = 0; j < nums.length; j++) {
                if(Character.isDigit(nums[j])) {
                    valid = false;
                    break;
                }
                if(nums[0] == '-' || nums[nums.length - 1] == '-') {
                    valid = false;
                    break;
                }

                if(j > 0 && j < nums.length - 1) {

                    if(nums[j] == '-' &&
                       (!Character.isLowerCase(nums[j - 1]) ||
                        !Character.isLowerCase(nums[j + 1]))) {
                        valid = false;
                        break;
                    }
                    if(nums[j] == '-' &&
                       Character.isLowerCase(nums[j - 1]) &&
                       Character.isLowerCase(nums[j + 1]) &&
                       hyphen == true) {
                        valid = false;
                        break;
                    }
                    if(nums[j] == '-' &&
                       Character.isLowerCase(nums[j - 1]) &&
                       Character.isLowerCase(nums[j + 1]) &&
                       hyphen == false) {
                        hyphen = true;
                    }
                }
                if((nums[j] == '!' || nums[j] == '.' || nums[j] == ',')
                   && j != nums.length - 1) {
                    valid = false;
                    break;
                }
                if((nums[j] == '!' || nums[j] == '.' || nums[j] == ',')
                   && j == nums.length - 1 && punch == true) {
                    valid = false;
                    break;
                }
                if((nums[j] == '!' || nums[j] == '.' || nums[j] == ',')
                   && j == nums.length - 1 && punch == false) {
                    punch = true;
                }
            }

            if(valid) {
                count++;
            }
        }

        return count;
    }
}