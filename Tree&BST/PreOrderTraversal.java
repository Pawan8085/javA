package javA.Tree&BST;

public class PreOrderTraversal {
    // Pre Order Traversal of binary tree iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk  = new Stack<>();

        if(root==null) return result;

        stk.add(root);
        while(!stk.isEmpty()){

            TreeNode temp = stk.pop();
            result.add(temp.val);

            // add right to the stack
            if(temp.right!=null){
                stk.add(temp.right);
            }

            // add left to the stack
            if(temp.left!=null){
                stk.add(temp.left);
            }
        }
        return result;
    }
}
