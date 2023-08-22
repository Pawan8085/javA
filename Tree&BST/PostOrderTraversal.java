package javA.Tree&BST;

public class PostOrderTraversal {
    // Post order traversal of a tree iterative
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk1  = new Stack<>();
        Stack<TreeNode> stk2  = new Stack<>();

        if(root==null) return result;

        stk1.add(root);
        while(!stk1.isEmpty()){

            TreeNode node = stk1.pop();
            stk2.add(node);
            if(node.left!=null) stk1.add(node.left);
            if(node.right!=null) stk1.add(node.right);

        }

        while(!stk2.isEmpty()){
            result.add(stk2.pop().val);
        }

        
        return result;
    }
}
