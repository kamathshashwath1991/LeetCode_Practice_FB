class Solution {
    public String customSortString(String S, String T) {
        if (T == null || T.length() == 0) return S;
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++){
            char c = T.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (map.containsKey(c)){
                int count = map.get(c);
                while(count > 0){
                    sb.append(c);
                    count--;
                }
            }
            map.remove(c);
        }
        
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            while(count > 0){
                sb.append(c);
                count--;
            }
        }
        
        return sb.toString();
    }
}