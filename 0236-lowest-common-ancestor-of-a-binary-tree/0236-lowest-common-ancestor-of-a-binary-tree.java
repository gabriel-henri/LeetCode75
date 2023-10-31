/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean itsAncestor(TreeNode node, TreeNode p, TreeNode q){
        if(node == null)
            return false;

        ArrayDeque<TreeNode> will = new ArrayDeque<>();
        int isf = 0;
        will.push(node);

        while(!will.isEmpty()){
            TreeNode current = will.pop();
            if(current == p || current == q){
                isf += 1;
                if(isf == 2)
                    return true;
            }

            if(current.left != null)
                will.push(current.left);
            if(current.right != null)
                will.push(current.right);
        }
        if(isf == 2)
            return true;
        else
            return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode menor = root;
        Queue<TreeNode> all = new ArrayDeque<>();
        all.offer(root);

        while(!all.isEmpty()){
            TreeNode current = all.poll();
            if(itsAncestor(current, p, q) && current != root){
                menor = current;
                if(current.left != null)
                    all.offer(current.left);
                if(current.right != null)
                    all.offer(current.right);
            }
            else if(current == root){
                if(current.left != null)
                    all.offer(current.left);
                if(current.right != null)
                    all.offer(current.right);
            }
        }
        return menor;
    }
}