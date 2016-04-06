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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> returnList = new ArrayList<List<Integer>>() ;
        
        List<Integer>  levelList= new ArrayList<Integer>() ;
        
        LinkedList<TreeNode> current = new LinkedList<TreeNode>() ;
        
        LinkedList<TreeNode> next = new LinkedList<TreeNode>() ;
        
        
        if(root == null){
            
            return returnList ;
            
        }
        else{
            
            current.offer(root);
            
            TreeNode HeadOfQueue = null ;
            
            while(current.peek() != null){
                
                HeadOfQueue = current.poll() ;
            
                levelList.add(HeadOfQueue.val) ;
            
                if(HeadOfQueue.left != null ){
                    
                    next.offer(HeadOfQueue.left) ;
                
                }
            
                if(HeadOfQueue.right != null ){
                
                    next.offer(HeadOfQueue.right) ;
                
                }
            
                if(current.peek() == null){
                
                
                    returnList.add(levelList) ;
                    current = next ;
                    next = new LinkedList<TreeNode>() ;
                    levelList = new ArrayList<Integer>() ;
                
                }
                 
                
            }
            
            
        }
        
        return returnList ;
        
        
    }
}