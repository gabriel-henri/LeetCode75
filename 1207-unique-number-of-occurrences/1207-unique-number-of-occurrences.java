import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numOcurrences = new HashMap<>();
        HashSet <Integer> orderOcur = new HashSet<>();

        for(int num : arr){
            if(numOcurrences.containsKey(num)){
                int n = numOcurrences.get(num);
                numOcurrences.put(num, n+1);
            }
            else{
                numOcurrences.put(num, 1);
            }
        }

        for(int key : numOcurrences.keySet()){
            Integer num = numOcurrences.get(key);
            if(!orderOcur.add(num))
                return false;
        }
        
        return true;
    }
}