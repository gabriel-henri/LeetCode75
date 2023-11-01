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
    public int maxLevelSum(TreeNode root) {
        int level = 0, levelOfMaximal = 0;
        int maximal = Integer.MIN_VALUE;

        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            int currentMax = 0;
            level += 1;
            int len = nodes.size();
            TreeNode current;

            for(int i = 0; i < len; i++){
                current = nodes.poll();
                currentMax += current.val;
                if(current.left != null)
                    nodes.add(current.left);
                if(current.right != null)
                    nodes.add(current.right);
            }
            if(level <= 1){
                maximal = currentMax;
                levelOfMaximal = level;
            }
            else{
                if(currentMax > maximal){
                    maximal = currentMax;
                    levelOfMaximal = level;
                }
            }
        }
        return levelOfMaximal;
    }
}