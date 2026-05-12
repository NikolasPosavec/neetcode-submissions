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

// BFS solution
class Solution {
    public int maxDepth(TreeNode root) {
        // empty tree case
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> todo = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        int deepest = -1;
        
        // add root to todo to start the search
        todo.push(root);
        // track current depth
        int temp = 0;
        
        while(!(todo.isEmpty())) {
            TreeNode curr = todo.pop();
            // add left node to todo 
            if(curr.left != null) {
                todo.push(curr.left);
            }
            // add right node to todo
            if(curr.right != null) {
                todo.push(curr.right);
            }

            temp++;
            // if both null undo temp increment and compare lengths
            if(curr.right == null && curr.left == null) {
                deepest = (temp > deepest) ? temp : deepest;
                temp = 0;
            }
            visited.add(curr);
        }

        return deepest;
    }
}
