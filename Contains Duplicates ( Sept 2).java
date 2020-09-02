class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] arr, int k, int t) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                long a = (long)arr[i];
                long b = (long)arr[j];
                long t_ = (long)t;
                if(Math.abs(a-b)<=t && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
