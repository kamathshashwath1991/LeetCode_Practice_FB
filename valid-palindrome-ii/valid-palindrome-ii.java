class Solution {
    public boolean validPalindrome(String s) {
        
        //"abca"
        //aba, aca
        int i = 0, j = s.length()-1;
        while(i < j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                String left = s.substring(i+1,j+1);
                String right = s.substring(i,j);
                return valid(left) || valid(right);
            }
        }
        return true;
    }
    
    private boolean valid(String s){
        int i = 0, j = s.length()-1;
        while(i < j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}