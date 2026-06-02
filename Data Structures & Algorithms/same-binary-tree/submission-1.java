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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return aux(p, q);
    }

    public boolean aux(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        } 

        if(p != null && q != null && p.val == q.val) {
            return aux(p.left, q.left);
        } 

        if(p != null && q != null && p.val == q.val) {
            return aux(p.right, q.right);
        } 

        return false;
    }
}
