class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int p = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    p = p*nums[j];

                }
            }
            arr[i]=p;
        }
        return arr;
        
    }
}  
