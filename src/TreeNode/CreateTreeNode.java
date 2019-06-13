package TreeNode;

/**
 * Sample TreeNode example. Java has predefined TreeNode class. This class can be used to create TreeNode.
 */
class TreeNode {
    private String value;
    private TreeNode treeNode;

    public TreeNode(TreeNode tn, String value) {
        this.treeNode = tn;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getTn() {
        return treeNode;
    }

    public void setTn(TreeNode tn) {
        this.treeNode = tn;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value='" + value + '\'' +
                ", TreeNode=" + treeNode +
                '}';
    }

}

/**
 * Recursive all the TreeNode.
 */
public class CreateTreeNode {
    private TreeNode retTreeNode;

    public TreeNode makeTreeNode(int iteration, TreeNode oldTn) {

        TreeNode tn = new TreeNode(oldTn, String.valueOf(iteration));
        this.retTreeNode = tn;
        if (iteration >= 0) {
            makeTreeNode(iteration - 1, tn);
        }
        return this.retTreeNode;
    }

    public static void main(String[] args) {
        // create TreeNode with iteration limit.
        TreeNode tn = new CreateTreeNode().makeTreeNode(1000, null);
        // call toString method.
        System.out.println(tn);
    }
}
