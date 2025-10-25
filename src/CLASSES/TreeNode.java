package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    // Instance Variables
    public T data;
    public List<TreeNode<T>> children;

    // Class Constructor
    public TreeNode(T data){
        this.data = data;
        this.children= new ArrayList<>();
    }

    // Method to add child to a node
    public void addChild(TreeNode<T> child){
        this.children.add(child);
    }
}
