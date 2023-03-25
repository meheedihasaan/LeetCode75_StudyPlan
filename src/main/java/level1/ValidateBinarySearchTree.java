/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */

public class ValidateBinarySearchTree {
    
    TreeNode root;
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(){
            
        }
        
        public TreeNode(int val){
            this.val = val;
        }
        
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public boolean isValidBST(TreeNode root){
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isValid(root, min, max);
    }
    
    public boolean isValid(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        
        if(root.val <= min || root.val >= max){
            return false;
        }
        
        boolean left = isValid(root.left, min, root.val);
        boolean right = isValid(root.right, root.val, max);
        return left && right;
    }
    
}
