/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class FindPivotIndex {
    public int pivotIndex(int nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            nums[i] = nums[i-1]+nums[i];
        }

        if(nums[n-1]-nums[0] == 0){
            return 0;
        }
        
        int ans = -1;
        for(int i = 1; i < n; i++){
            if(nums[i-1] == nums[n-1]-nums[i]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
