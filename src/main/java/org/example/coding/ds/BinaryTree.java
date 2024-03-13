package org.example.coding.ds;

public class BinaryTree {
    Nodes root;
    public void insert(int data) {
        root = insertRec(root,data);
    }
    public Nodes insertRec(Nodes root, int data){
        if(root==null)
            root = new Nodes(data);
        else if(data< root.data){
            root.left = insertRec(root.left,data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Nodes root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.println(root.data+" ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(12);
        binaryTree.insert(15);
        binaryTree.insert(2);
        binaryTree.insert(5);
        binaryTree.inOrder();
    }
}
