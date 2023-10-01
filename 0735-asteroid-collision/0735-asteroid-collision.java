import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asts = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){
            if(asts.empty()){
                asts.push(asteroids[i]);
            }
            else{
                int inTop = asts.peek();

                    while(!asts.empty() && inTop != 0 && (asteroids[i] < 0 && inTop > 0)){
                        if(Math.abs(inTop) == Math.abs(asteroids[i])){
                            asts.pop();
                            inTop = 0;
                        }
                        else if(Math.abs(inTop) < Math.abs(asteroids[i])){
                            asts.pop();
                            if(!asts.empty())
                                inTop = asts.peek();
                            else
                                inTop = -1;
                        }
                        else{
                            inTop = 0;
                        }
                    }
                if(inTop != 0 && !(asteroids[i] < 0 && inTop > 0)){
                    asts.push(asteroids[i]);
                }
            }
        }
        int len = asts.size();
        int[] remain = new int[len];

        while(!asts.empty()){
            len--;
            remain[len] = asts.pop();
        }

        return remain;
    }
}