import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> charInW1 = new HashMap<>();
        HashMap<Character, Integer> charInW2 = new HashMap<>();

        if(word1.length() != word2.length())
            return false;

        for(int i = 0; i < word1.length(); i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if(charInW1.containsKey(c1)){
                int num = charInW1.get(c1);
                charInW1.put(c1, num+1);
            }
            else{
                charInW1.put(c1, 1);
            }

            if(charInW2.containsKey(c2)){
                int num = charInW2.get(c2);
                charInW2.put(c2, num+1);
            }
            else{
                charInW2.put(c2, 1);
            }
        }

        List<Integer> valsW1 = new ArrayList<>();
        List<Integer> valsW2 = new ArrayList<>();

        for(Character c : charInW1.keySet()){
            Integer val = charInW1.get(c);
            valsW1.add(val);
            if(!charInW2.containsKey(c)){
                return false;
            }
        }

        for(Character c: charInW2.keySet()){
            Integer val = charInW2.get(c);
            valsW2.add(val);
            if(!charInW1.containsKey(c))
                return false;
        }

        Collections.sort(valsW1);
        Collections.sort(valsW2);

        return valsW1.equals(valsW2);
        
    }
}