package javA.Tree&BST;

public class InOrderTraversal {
    // In order traversal of binary tree iterative 
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk  = new Stack<>();

        TreeNode node = root;
        while(!stk.isEmpty() || node!=null){

            if(node!=null) {
                stk.add(node);
                node = node.left;
            }else{
                node = stk.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }
}
