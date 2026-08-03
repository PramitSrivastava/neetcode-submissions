class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> res = new ArrayList<>();
         StringBuilder sb = new StringBuilder();
         backtrack(res,sb,n,0,0);
         return res;
    }
    private void backtrack(List<String> res , StringBuilder sb , int n, int openN , int closedN)
    {
        if(openN == closedN && openN == n)
        {
            res.add(sb.toString());
            return;
        }
        if(openN < n)
        {
            sb.append('(');
            backtrack(res,sb,n,openN+1,closedN);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(closedN < openN)
        {
            sb.append(')');
            backtrack(res,sb,n,openN,closedN + 1);
            sb.deleteCharAt(sb.length() - 1);
        }


    }
}