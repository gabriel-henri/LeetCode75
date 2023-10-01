import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answ = new ArrayList<>();
        int maximo;

        maximo = Arrays.stream(candies).max().getAsInt();

        for(int candie : candies){
            answ.add((candie+extraCandies) >= maximo);
        }
        return answ;
    }
}