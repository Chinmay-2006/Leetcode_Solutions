class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){ // rows
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){ // columns
                sum = sum + accounts[i][j]; 
            }
            if(richest < sum){
                richest = sum;
            }
        }
        return richest;
    }
}