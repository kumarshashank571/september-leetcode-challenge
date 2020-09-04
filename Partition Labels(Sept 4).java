class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> ans = new ArrayList<>();
        int[] lastocc = new int[26];
        for(int i=0;i<str.length();i++){
            lastocc[str.charAt(i)-'a'] = i;
        }
        int i=0;
        while(i<str.length()){
            int end = lastocc[str.charAt(i)-'a'];
            int j = i;
            while(j != end){
                end = Math.max(end,lastocc[str.charAt(j)-'a']);
                j++;
            }
            ans.add(j-i+1);
            i = j+1;
        }
        return ans;
    }
}
