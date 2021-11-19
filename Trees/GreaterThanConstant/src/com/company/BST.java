package com.company;

public class BST {
    private BSTNode root;

    BST() {
        this.root = null;
    }

    BST(int element) {
        this.root = new BSTNode(element);
    }

    BSTNode root() {
        return this.root;
    }

    public void inOrder(BSTNode root) {
        if (root == null)
            return;
        inOrder(root.left());
        System.out.print(root.element() + ";");
        inOrder(root.right());
    }

    public void preOrder(BSTNode root) {
        if (root == null)
            return;
        System.out.print(root.element() + ";");
        preOrder(root.left());
        preOrder(root.right());
    }

    void insert(int element) {
        //BSTNode newNode = new BSTNode(element);
        BSTNode currentNode = this.root;
        BSTNode prevNode = this.root;

        while (currentNode != null) {
            prevNode = currentNode;
            currentNode.incSize();
            if (currentNode.element() > element) {
                currentNode = currentNode.left();
            } else {
                currentNode = currentNode.right();
            }
        }
        // if trying to insert in an empty BST
        if (prevNode == null) {
            this.root = new BSTNode(element);
            return;
        }

        if (prevNode.element() > element) {
            prevNode.setLeft(element);
        } else {
            prevNode.setRight(element);
        }
    }

    void delete(BSTNode root,int element){
        BSTNode node = findElementRecursionUtil(root,element);
        if(node == null)
            return;
        //if it is a leaf node
        if(node.left()==null && node.right()==null)
        {
            if(node.parent().left()==node)
                node.parent().replaceLeft(null);
            else
                node.parent().replaceRight(null);
        }
        //has only right child
        else if(node.left()==null && node.right()!=null){
            if(node.parent().left()==node)
                node.parent().replaceLeft(node.right());
            else
                node.parent().replaceRight(node.right());
        }
        //has only left child
        else if(node.left()!=null && node.right()==null){
            if(node.parent().left()==node)
                node.parent().replaceLeft(node.left());
            else
                node.parent().replaceRight(node.left());
        }
        //has 2 children
        else
        {
            BSTNode temp = findMaxUtil(node.left());
            node.setElement(temp.element());
            delete(node.left(),temp.element());
        }
    }

    BSTNode findElement(int el) {
        return findElementRecursionUtil(this.root, el);
    }

    private BSTNode findElementRecursionUtil(BSTNode root, int el) {

        if (root == null)
            return null;

        if (root.element() == el)
            return root;
        if (root.element() > el)
            return findElementRecursionUtil(root.left(), el);

        return findElementRecursionUtil(root.right(), el);
    }

    private boolean findElementNonRecursionUtil(int el) {
        BSTNode currNode = this.root;

        while (currNode != null) {
            if (currNode.element() == el)
                break;
            if (currNode.element() > el)
                currNode = currNode.left();
            else
                currNode = currNode.right();
        }
        return currNode != null;
    }

    int findMin(){
        return findMinUtil(this.root()).element();
    }

    BSTNode findMinUtil(BSTNode root){

            BSTNode currNode = root;
            if (currNode == null) {
                throw new IllegalStateException("there is no tree to find min");
            }
            while (currNode.left() != null) {
                currNode = currNode.left();
            }
            return currNode;
    }

    BSTNode findMaxUtil(BSTNode root){

        BSTNode currNode = root;
        if (currNode == null) {
            throw new IllegalStateException("there is no tree to find min");
        }
        while (currNode.right() != null) {
            currNode = currNode.right();
        }
        return currNode;

    }

    BSTNode LCA(int n1, int n2){
        BSTNode currNode = this.root;
        if(n1 > n2)
        {
            int temp = n1;
            n1=n2;
            n2=temp;
        }
        while(!((n1 <= currNode.element())&& (currNode.element() <= n2)))
        {
            if(currNode.element() < n1)
            {
                currNode = currNode.right();
            }
            else
            {
                currNode= currNode.left();
            }
        }
        return currNode;
    }

}
