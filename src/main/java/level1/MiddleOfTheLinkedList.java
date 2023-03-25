/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class MiddleOfTheLinkedList {
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
    
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
}
