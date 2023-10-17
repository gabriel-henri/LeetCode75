/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 import java.util.ArrayList;

class Solution {
    public void searchLeafs(TreeNode root, ArrayList<Integer> visitados){
        if(root == null){
            return;
        }
        
        searchLeafs(root.left, visitados);
        searchLeafs(root.right, visitados);

        if(root.left == null && root.right == null)
            visitados.add(root.val);

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafroot1 = new ArrayList<>();
        ArrayList<Integer> leafroot2 = new ArrayList<>();

        searchLeafs(root1, leafroot1);
        searchLeafs(root2, leafroot2);

        return leafroot1.equals(leafroot2);
    }
}