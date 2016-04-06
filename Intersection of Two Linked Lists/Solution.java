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
        

        Map<ListNode,Integer> map=new TreeMap<ListNode,Integer>( new Comparator<ListNode>() {
                
                @Override
                public int compare(ListNode e1,
                        ListNode e2) {
                    return e1.val-(e2.val);
                }
            }); 
        
        ListNode current=headA;
       
        while(current!=null)
        {
           
            map.put(current,1);
            current=current.next;
        }
        ListNode current1=headB;
       
        while(current1!=null)
        {
            if(map.containsKey(current1))
                return current1;
            else    
               
            current1=current1.next;
        }
        return null ;
}

    
}