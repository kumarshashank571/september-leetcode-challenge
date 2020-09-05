class Solution {
    void addelement(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
         addelement(root.left,ans);
        ans.add(root.val);
        addelement(root.right,ans);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        List<Integer> finalans = new ArrayList<>();
        addelement(root1,ans1);
        addelement(root2,ans2);
        int i = 0;int j = 0;
        while(i<ans1.size() && j<ans2.size()){
            if(ans1.get(i)==ans2.get(j)){
                finalans.add(ans1.get(i));
                finalans.add(ans1.get(i));
               i++;j++;
            }
            else if(ans1.get(i)<ans2.get(j)){
                finalans.add(ans1.get(i));
                i++;
            }
            else{
                finalans.add(ans2.get(j));
                j++;
            }
        }
        while(i<ans1.size()){
            finalans.add(ans1.get(i));
            i++;
        }
         while(j<ans2.size()){
            finalans.add(ans2.get(j));
            j++;
        }
        return finalans;
        
    }
}
