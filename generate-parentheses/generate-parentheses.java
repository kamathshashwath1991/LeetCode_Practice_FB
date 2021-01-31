class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(2* n,0,0,new StringBuilder(), list);
        return list;
    }
    
    private void helper(int n, int open, int close, StringBuilder sb, List<String> list){
        
        if (sb.length() == n){
            list.add(sb.toString());
            return;
        }
       
       for (int i = open; i < n/2; i++){
           sb.append("(");
           helper(n,i+1,close,sb,list);
           sb.deleteCharAt(sb.length()-1);
       }
       
        for(int i = close; i < open; i++){
            sb.append(")");
            helper(n,open,i+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}