class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 1, in = 0, si =  chars.length;
        if(si == 1)
            return si;

        while(i < si){
            while(j < si && chars[i] == chars[j]){
                j++;
            }
            chars[in] = chars[j-1];
            in++;

            if((j-i) != 1){
                String s = (j-i)+"";
                for(char c: s.toCharArray()){
                    chars[in] = c;
                    in++;
                }
            }
            i = j;
            j += 1;
        }
        return in;
    }
}