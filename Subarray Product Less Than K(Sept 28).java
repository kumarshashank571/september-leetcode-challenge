class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int r) {
        if(r<=1){return 0;}
        int count= 0;
        int right = 0;
        int left = 0;
        int product = 1;
        for(right = 0;right<arr.length;right++){
            product *= arr[right];
            while(product>=r){
                product = product/arr[left];
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}
