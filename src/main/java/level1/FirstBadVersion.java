/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class FirstBadVersion {
    
    public static boolean isBadVersion(int n){
        return n == 4;
    }
    
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right = mid-1;
                if(!isBadVersion(right)){
                    return mid;
                }
            }
            else{
                left = mid+1;
            }
        }
        return n;
    }
    
}
