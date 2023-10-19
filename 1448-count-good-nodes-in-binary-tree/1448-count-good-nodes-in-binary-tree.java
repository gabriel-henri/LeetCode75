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
class Solution {

    private int dfs(TreeNode node, int maxval){
        if(node == null)
            return 0;

        int result;
        result = (node.val >= maxval) ? 1 : 0;

        maxval = Math.max(maxval, node.val);
        
        result += dfs(node.left, maxval);
        result += dfs(node.right, maxval);

        return result;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}