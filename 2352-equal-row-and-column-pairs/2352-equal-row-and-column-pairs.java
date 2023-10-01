import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length, cont = 0;
        int [][] transpost = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transpost[i][j] = grid[j][i];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(Arrays.equals(grid[i], transpost[j])){
                    cont++;
                }
            }
        }
        return cont;
    }
}