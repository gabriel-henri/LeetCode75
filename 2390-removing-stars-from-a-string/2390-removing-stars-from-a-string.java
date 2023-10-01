import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stackChar = new Stack<>();

        for(char c : s.toCharArray()){
            if(c =='*'){
                if(!stackChar.empty()){
                    stackChar.pop();
                }
            }
            else{
                stackChar.push(c);
            }
        }

        int len = stackChar.size();
        char[] ans = new char[len];

        while(!stackChar.empty()){
            len--;
            ans[len] = stackChar.pop();
        }

        return new String(ans);
    }
}