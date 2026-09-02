class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero = 0;
        int productarr[] = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }else{
                product *= nums[i];
            }
        }
        for(int j=0; j<nums.length; j++){
            if(zero>1){
                productarr[j] = 0;
            }else if(zero == 1){
                if(nums[j] == 0){
                    productarr[j] = product;
                }else{
                    productarr[j] = 0;
                }
            }
            else{
            productarr[j] = product / nums[j];
            }
        }
        return productarr;
    }
}  
