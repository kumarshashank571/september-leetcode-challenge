class Solution {
    public int findPoisonedDuration(int[] arr, int t) {
        int count = 0;
        int start = 0;
        int end = -1;
        for(int i=0;i<arr.length;i++){
            start = arr[i];
            if(end<start){
                count += t;
            }
          else{
              count += start-end-1+t;
          }
            end = start+t-1;
        }
        return count;
    }
}
