/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class MergeTwoSortedList {
    
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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ans.next = list1;
                list1 = list1.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
            }
            
            ans = ans.next;
        }
        
        if(list1 == null){
            ans.next = list2;
        }
        
        if(list2 == null){
            ans.next = list1;
        }
        
        return ansHead.next;
    }
    
}
