/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
     
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       
       
         ListNode temp = headA ;
         ListNode returnNode = null ;
         int list1size = 0 ;
         int list2size = 0 ;
         while(temp != null){
             list1size ++ ;
          
            temp = temp.next ;
         
             
         }
         
         temp = headB ;
         
         while( temp != null){
             
             list2size ++ ;
             
             temp = temp.next ;
             
         }
        

        
        if(list1size > list2size){
            
            int diff = list1size - list2size ;
            
            while(diff>0){
                
                headA = headA.next ;
                diff--;
            }
        
        }
        else{
            
           int diff = list2size - list1size;
            
            while(diff>0){
                
                headB = headB.next ;
                diff-- ;
            }
            
      
            
            
        }
        

        returnNode = findIntersection(headB,headA);
        return returnNode ;
        
    }
    
    ListNode findIntersection(ListNode longerListHead, ListNode shorterListHead){
        
        while(longerListHead != null && shorterListHead != null){
            
            if(longerListHead.val == shorterListHead.val){
                
                return longerListHead ;
            }
            
                longerListHead = longerListHead.next ;
                shorterListHead = shorterListHead.next ;
            
            
        }
        return null ;
        
    }
    
  
    
}
