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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lista = new ArrayList<>();
        Queue<TreeNode> nodes = new ArrayDeque<>();

        if(root == null)
            return lista;

        nodes.add(root);

        while(!nodes.isEmpty()){
            TreeNode mostRight = null;
            int len = nodes.size();
        
            for(int i = 0; i < len; i++){
                TreeNode current = nodes.poll();

                mostRight = current;
                if(current.left != null)
                    nodes.add(current.left);
                if(current.right != null)
                    nodes.add(current.right);
            }
            lista.add(mostRight.val);

        }
        return lista;
    }
}