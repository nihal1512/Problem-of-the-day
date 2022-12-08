class Solution {
     private void generate(List<Integer> res ,TreeNode node){
        if(node==null){
            return;
        }
        if(node.left==null&&node.right==null){
            res.add(node.val);
            return;
        }
        generate(res,node.left);
        generate(res,node.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        generate(list1,root1);
        generate(list2,root2);
        return list1.equals(list2);
        
    }
}
