class Solution {
    public int noofdigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String str = "123456789";
        int nl = noofdigit(low);
        int nh = noofdigit(high);
        for(int i=nl;i<=nh;i++){
            for(int j=0;j<=str.length()-i;j++){
                String s = str.substring(j,j+i);
                int num = Integer.parseInt(s);
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}
