class Solution {
    int sum =0;
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        helper(root,0);
        return sum;
    }
    public void helper(TreeNode root,int bin){
        if(root==null){
            return;
        }
        bin = bin<<1;
        if(root.val==1){
            bin++;
        }
        if(root.left==null && root.right==null){
            sum += bin;
            return;
        }
        helper(root.left,bin);
        helper(root.right,bin);
    }
}
