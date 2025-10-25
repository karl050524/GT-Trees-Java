package CLASSES;

public class Tree<T> {
    public TreeNode<T> root;

    // Class Constructor
    public Tree(TreeNode<T> root){
        this.root = root;
    }

    public void printTree(){
        printTreeReclusive(root, 0);
    }

    private void printTreeReclusive(TreeNode<T> node, int level) {
        // Node Validation
        if (node == null) {
            return;
        }

        // Print the current node's data with indentation.
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(">> " + node.data);

        // Recursive step: call this method for all children.
        for(TreeNode<T> child: node.children){
            printTreeReclusive(child,level+1);
        }
    }
}
