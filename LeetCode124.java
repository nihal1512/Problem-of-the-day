class Solution {
    int val = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        postOrder(root);
        return val;
    }
    
    private int postOrder(TreeNode root){
        if(root == null) return 0;
        int sumLeft = postOrder(root.left);
        int sumRight = postOrder(root.right);
        int max = Math.max(root.val,Math.max(root.val+sumLeft,Math.max(root.val+sumRight,root.val+sumRight+sumLeft)));
        if(max>val) val = max;
        return root.val>root.val+Math.max(sumLeft,sumRight)?root.val:root.val+Math.max(sumLeft,sumRight);
    }
}
