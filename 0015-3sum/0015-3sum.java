class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int x = 0; x < nums.length - 2; x++){
            // skipping duplicate x values
            if(x > 0 && (nums[x] == nums[x - 1])){
                continue;
            }
            int left = x + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == (-1 * nums[x])){
                    result.add(Arrays.asList(nums[x], nums[left], nums[right]));
                    left++;
                    right--;
                    // skipping duplicate j  values
                    while(left < right && (nums[left] == nums[left - 1])){
                        left++;
                    }
                    // skipping duplicatek values
                    while(right > left && (nums[right] == nums[right + 1])){
                        right--;
                    }
                }
                else if(sum > (-1 * nums[x])){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return result;
    }
}