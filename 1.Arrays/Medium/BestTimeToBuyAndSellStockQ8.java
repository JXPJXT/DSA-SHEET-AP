//Ques-8
//Platform LeetCode 121 Easy
//Companies: Amazon D-E-Shaw Directi Flipkart Goldman Sachs Intuit MakeMyTrip Microsoft Ola Cabs Oracle Paytm Pubmatic Quikr Salesforce Sapient Swiggy Walmart Media.net Google
// Time Complexity: O(n)  — We traverse the prices array once.
// Space Complexity: O(1) — Only a few variables are used, no extra data structures.

class BestTimeToBuyAndSellStockQ8{
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockQ8 obj = new BestTimeToBuyAndSellStockQ8();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + obj.maxProfit(prices)); // Expected output: 5
    }
    public int maxProfit(int[] prices){
        int val=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<val){
                val=prices[i];
            }
            else{
                maxProfit=Math.max(maxProfit, prices[i]-val);
            }
        }
        return maxProfit;
    }
}