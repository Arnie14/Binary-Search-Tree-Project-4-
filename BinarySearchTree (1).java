public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {

public void Iterator(Node root) {
        
    }
    
    int next() {
        
    }
    
    bool hasNext() {
        
    }
public static void insert(Node root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new Node(key);
        }
 
        // if the given key is less than the root node,
        // recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // otherwise, recur for the right subtree
        else {
            // key >= root.data
            root.right = insert(root.right, key);
        }
 
        
    }

 public static boolean searchRecursively(Node root, int value) {


        if (root == null)
            return false;


        if ((int) root.data == value)
            return true;

        if (value < (int) root.data)
            return searchRecursively(root.left, value);

        else if (value > (int) root.data)
            return searchRecursively(root.right, value);


        return false;
    }
public static Node deleteRecursively(Node root, int value) {

        if (root == null)
            return root;

        if (value < (int) root.data) {
            root.left = deleteRecursively(root.left, value);
        } else if (value > (int) root.data) {
            root.right = deleteRecursively(root.right, value);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null)
                return root.left;

            root.data = inOrderSuccessor(root.right);
            root.right = deleteRecursively(root.right, (int) root.data);
        }

        return root;
}