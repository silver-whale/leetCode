public class Leetcode617 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }


        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){return root2;}
        if(root2==null){return root1;}

        TreeNode curr = new TreeNode(root1.val + root2.val);
        curr.left = mergeTrees(root1.left, root2.left);
        curr.right = mergeTrees(root1.right, root2.right);

        return curr;
    }



}