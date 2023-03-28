/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class NaryTreePreorderTraversal {
    
    class Node {
        public int val;
        public List<Node> children;
        
        public Node() {
            
        }
        
        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, List<Node> children){
            this.val = val;
            this.children = children;
        }
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
    
    public void dfs(Node root, List<Integer> ans){
        if(root == null){
            return;
        }
        
        ans.add(root.val);
        for(Node child : root.children){
            dfs(child, ans);
        }
    }
}
