/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        
        Stack<TreeNode> stack = new Stack<TreeNode>() ;
        
        if(root == null){
            
            return list ;
        }
        
        TreeNode current = null ;
        
        stack.push(root);
        
        while(!stack.empty()){
            
            current  = stack.pop() ;
            
            list.add(0,current.val);
            
            if(current.left!=null){
                
                stack.push(current.left) ;
            }
            
            if(current.right != null ){
                stack.push(current.right) ;
                
            }
            
            
        }
	   
        return list ;
        
    }
}