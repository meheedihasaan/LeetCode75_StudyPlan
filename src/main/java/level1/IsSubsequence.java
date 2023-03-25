/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
                if(j == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
