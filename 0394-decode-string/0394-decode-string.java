import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> aux = new Stack<>();
        StringBuilder resp = new StringBuilder();
        int ind = 0;

        while(ind < s.length()){
            if(Character.isDigit(s.charAt(ind))){
                int num = 0;

                while(Character.isDigit(s.charAt(ind))){
                    num = num*10 + s.charAt(ind) - '0';
                    ind++;
                }
                numbers.push(num);
            }
            else if(s.charAt(ind) == '['){
                aux.push(resp.toString());
                resp = new StringBuilder();
                ind++;
            }
            else if(s.charAt(ind) == ']'){
                StringBuilder temp = new StringBuilder(aux.pop());
                int num = numbers.pop();

                for(int i = 0; i < num; i++){
                    temp.append(resp.toString());
                }
                resp = new StringBuilder(temp);
                ind++;
            }
            else{
                resp.append(s.charAt(ind));
                ind++;
            }
        }
        return resp.toString();
    }
}