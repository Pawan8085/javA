package javA.Tree&BST;

public class BalanceBST {
    // Balance a BST
    public TreeNode balanceBST(TreeNode root) {

        List<Integer> list = new ArrayList<>(); 
        inOrder(root, list);
        return constructBst(list, 0, list.size()-1);
     }
 
     public void inOrder(TreeNode root, List<Integer> result){
         if(root==null) return;
 
         inOrder(root.left, result);
         result.add(root.val);
         inOrder(root.right, result);
     }
 
 
 
     TreeNode constructBst(List<Integer> list, int low, int high){
 
         if(low>high) return null;
         int mid = (low+high)/2;
 
         int data = list.get(mid);
         TreeNode lc = constructBst(list, low, mid-1);
         TreeNode rc = constructBst(list, mid+1, high);
 
         TreeNode node = new TreeNode(data, lc, rc);
         return node;
     }
}
