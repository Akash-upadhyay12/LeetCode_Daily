class Solution {
    public String sortVowels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return s.indexOf(a) - s.indexOf(b);
            }
            return map.get(b) - map.get(a);
        });
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> li = new ArrayList<>();
        for(char ch : list){
            int a = map.get(ch);
            for(int i = 0; i<a; i++){
                li.add(ch);
            }
        }
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' &&  ch != 'o' && ch != 'u'){
                sb.append(ch);
            }
            else{
                sb.append(li.get(idx));
                idx++;
            }
        }

        return sb.toString();
    }
}