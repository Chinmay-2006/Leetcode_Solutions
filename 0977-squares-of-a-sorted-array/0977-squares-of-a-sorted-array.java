class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[] = new int[nums.length];
        int b[] = new int[nums.length];
        int a1 = 0;
        int b1 = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0){
                a[a1] = nums[i] * nums[i]; // squarring
                a1++;
                i++; 
            } else{
                b[b1] = nums[i] * nums[i]; // squarring
                b1++;
                i++;
            }
        }
        int x = 0; // it is for a array
        int j = b1 - 1; // it is for b array
        int n = 0;
        while(x < a1 && j >= 0){
            if(a[x] < b[j]){
                nums[n] = a[x];
                n++;
                x++;
            } else{
                nums[n] = b[j];
                j--;
                n++;
            }
        }
        while(j >= 0){
            nums[n] = b[j];
            j--;
            n++;
        }
        while(x < a1){
            nums[n] = a[x];
            x++;
            n++;
        }
        return nums;
    }
}