class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder nword = new StringBuilder();
        int i = 0, j = 0;
        char c;

        while(i <= word1.length()-1 && j <= word2.length()-1){
            if((i+j)%2 == 0){
                c = word1.charAt(i);
                nword.append(c);
                i++;
            }
            else{
                c = word2.charAt(j);
                nword.append(c);
                j++;
            }
        }

        while(i <= word1.length()-1){
            c = word1.charAt(i);
            nword.append(c);
            i++;
        }

        while(j <= word2.length() -1){
            c = word2.charAt(j);
            nword.append(c);
            j++;
        }

        return nword.toString();
    }
}