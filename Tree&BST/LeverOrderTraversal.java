package javA.Tree
public class LeverOrderTraversal {
    // Level Order traversal of a tree
    public List<List<Integer>> levelOrder(TreeNode root) {
    
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return result;
        queue.add(root);
        while(queue.size()>0){

            int n= queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;++i){

                TreeNode  node = queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(list);
        }

        return result;
    }
}
