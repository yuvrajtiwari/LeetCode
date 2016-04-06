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
    public void flatten(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>() ;
        
        TreeNode TOS = null ;
        TreeNode current = root ;
        
        //stack.push(root) ;
        
        while(!stack.empty() || current != null){
            
            
            
            if(current.right != null){
                
                stack.push(current.right) ;
                
            }
            if(current.left != null ){
                
                
                current.right = current.left ;
                current.left = null;
                
                
                }
            else if(!stack.empty()){
                    
                    TOS = stack.pop();
                    current.right = TOS ;
                    
            }
                
           current = current.right ;
            
            
            
            
            
        }
        
        
        
        
    }
}