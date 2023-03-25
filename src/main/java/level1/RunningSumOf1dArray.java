/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
