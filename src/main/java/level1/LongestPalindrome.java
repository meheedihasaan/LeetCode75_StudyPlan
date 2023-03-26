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
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int ans = 0;
        boolean flag = false;
        for(char c : map.keySet()){
            if(map.get(c)%2 == 0){
                ans+=map.get(c);
            }
            else{
                flag = true;
                ans+=map.get(c)-1;
            }
        }

        if(flag){
            ans++;
        }
        return ans;
    }
}
