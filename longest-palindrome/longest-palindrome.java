class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!set.contains(c)){
                set.add(c);
            }
            else{
                count += 2;;
                set.remove(c);
            }
        }
        
        return set.isEmpty() ? count : count+1;
    }
}
