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
    public List<Integer> inorderTraversal(TreeNode root) {
        

        
      ArrayList<Integer> returnList = new ArrayList<Integer>();
  
        if(root == null){
            
            return returnList ;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode currentNode = root ;
        
        
    while(!stack.isEmpty() || currentNode != null){
        
    
        if(currentNode!=null){
            stack.push(currentNode);
            currentNode = currentNode.left ;
        }
        else{
            TreeNode output = stack.pop();
            currentNode = output.right ;
            returnList.add(output.val);
        }
        
    }
  return returnList;
    
}

}