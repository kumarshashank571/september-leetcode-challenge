class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> finalans = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        combinationsum3(k,n,arr,0,finalans,ans);
        return finalans;
    }
    public void combinationsum3(int k,int n,int[] arr,int idx,List<List<Integer>> finalans,List<Integer> ans){
        if(ans.size()==k){
            if(n==0){
            finalans.add(new ArrayList<>(ans));}
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(n-arr[i]>=0 && ans.size()<k){
                ans.add(arr[i]);
                combinationsum3(k,n-arr[i],arr,i+1,finalans,ans);
                ans.remove(ans.size()-1);
            }
        }
        return;
    }
}
