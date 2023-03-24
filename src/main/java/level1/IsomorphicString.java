/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(map1.containsKey(c)){
                if(map1.get(c) != d){
                    return false;
                }
            }
            else{
                map1.put(c, d);
            }
            
            if(map2.containsKey(d)){
                if(map2.get(d) != c){
                    return false;
                }
            }
            else{
                map2.put(d, c);
            }
        }
        return true;
    }
}
