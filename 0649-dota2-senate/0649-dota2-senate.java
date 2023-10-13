import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> d = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        for(int i = 0; i < senate.length(); i++){
            char fromsenate = senate.charAt(i);
            if(fromsenate == 'D'){
                d.add(i);
            }
            else{
                r.add(i);
            }
        }

        while(!d.isEmpty() && !r.isEmpty()){
            int fromd = d.poll();
            int fromr = r.poll();

            if(fromd < fromr){
                d.add(fromd+senate.length());
            }
            else{
                r.add(fromr+senate.length());
            }
        }
        if(!d.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}