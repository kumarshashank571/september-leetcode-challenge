class Solution {
    // public int firstMissingPositive(int[] arr) {
    //     int[] count = new int[arr.length+1];
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<=arr.length && arr[i]>0){
    //             count[arr[i]]++;
    //         }
    //     }
    //     for(int i=1;i<count.length;i++){
    //         if(count[i]==0){
    //             return i;
    //         }
    //     }
    //     return arr.length+1;
    // }
    public int firstMissingPositive(int[] arr) {
        boolean containsone = false;
        for(int x:arr){
            if(x==1){
                containsone = true;
                break;
            }
        }
        if(containsone==false){return 1;}
        int n = arr.length;
        if(n==1){return 2;}
        for(int i=0;i<n;i++){
            if(arr[i]<=0 || arr[i]>n){arr[i]=1;}
        }
        for(int i=0;i<n;i++){
            int x = Math.abs(arr[i]);
            if(arr[x-1]>0){arr[x-1] *= -1;}
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){return i+1;}
        }
        return n+1;
    }
}
