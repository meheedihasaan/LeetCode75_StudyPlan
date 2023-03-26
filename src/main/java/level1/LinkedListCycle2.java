/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class LinkedListCycle2 {
    
    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(){
            
        }
        
        public ListNode(int val){
            this.val = val;
        }
        
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        
        if(!hasCycle){
            return null;
        }
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    
}
