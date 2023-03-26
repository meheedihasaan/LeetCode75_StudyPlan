/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1;

/**
 *
 * @author User
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int sellingPrice = prices[n-1];
        for(int i = n-1; i >= 0; i--){
            maxProfit = Math.max(maxProfit, sellingPrice-prices[i]);
            sellingPrice = Math.max(sellingPrice, prices[i]);
        }
        return maxProfit;
    }
}
