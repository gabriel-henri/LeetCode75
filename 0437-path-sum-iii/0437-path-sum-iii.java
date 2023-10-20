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
    private int aux(TreeNode node, long target){
        if(node == null)
            return 0;

        int result = 0;

        if(node.val == target)
            result = 1;

        result += aux(node.left, target - node.val);
        result += aux(node.right, target - node.val);

        return result;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        
        return pathSum(root.left, targetSum) + pathSum(root.right, targetSum) + aux(root, targetSum);
    }
}