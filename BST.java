// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class BSTIterator {
    private int itr;
    private List<Integer> orderedTree;

    public BSTIterator(TreeNode root) {
        this.itr = -1;
        this.orderedTree = new ArrayList();
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        orderedTree.add(root.val);
        inorder(root.right);
    }

    public int next() {
        if(orderedTree.size() == 0) return itr;
        if(hasNext()) {
            if(itr == -1) {
                itr = 0;
            } else {
                itr++;
            }
            return orderedTree.get(itr);
        } else {
            return -1;
        }
    }

    public boolean hasNext() {
        if(orderedTree.size() == 0) return false;
        return itr < orderedTree.size() - 1;
    }
}



// Your code here along with comments explaining your approach