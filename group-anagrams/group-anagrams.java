class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
​
        HashMap<Long,List<String>> map = new HashMap<>();
​
        for (String s : strs){
            long primeProductVal = primeProduct(s);
            if (!map.containsKey(primeProductVal)){
                map.put(primeProductVal, new ArrayList<String>());
            }
            map.get(primeProductVal).add(s);
        }
​
        return new ArrayList<>(map.values());
    }
​
    private Long primeProduct(String s){
        long result = 1;
        int primeArray[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int i = 0; i < s.length(); i++){
            result *= primeArray[s.charAt(i) - 'a'];
        }
        return result;
    }
}
