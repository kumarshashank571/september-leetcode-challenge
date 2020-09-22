class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(count*1.0>Math.ceil(arr.length/3)){
                    ans.add(arr[i-1]);
                }
                count=1;
            }
        }
        if(count*1.0>Math.ceil(arr.length/3)){
            ans.add(arr[arr.length-1]);
        }
        return ans;
    }
}
