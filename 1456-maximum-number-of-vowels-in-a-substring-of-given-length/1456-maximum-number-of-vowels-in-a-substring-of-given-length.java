class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int maxv = 0, v = 0, start = 0, end = 0;
        while(end < s.length() && end < k){
            char c = s.charAt(end);
            if(isVowel(c)){
                v++;
                maxv++;
            }
            end++;
        }

        while(end < s.length()){
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);

            if(isVowel(c1))
                v--;
            if(isVowel(c2))
                v++;

            if(maxv < v){
                maxv = v;
            }

            start++;
            end ++;
        }
        return maxv;
    }
}