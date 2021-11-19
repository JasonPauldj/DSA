package com.company;

public class BTree {
    BTNode root;

    public BTree() {
        this.root = null;
    }

    public BTree(int el) {
        root = new BTNode(el);
    }

    public BTNode root() {
        if (root == null)
            throw new IllegalStateException("The tree is empty");
        return root;
    }

    public void preOrder(BTNode root) {
        if (root == null)
            return;
        System.out.print(root.element() + ";");
        preOrder(root.left());
        preOrder(root.right());
    }

    public void inOrder(BTNode root) {
        if (root == null)
            return;
        inOrder(root.left());
        System.out.print(root.element() + ";");
        inOrder(root.right());
    }

    public void postOrder(BTNode root) {
        if (root == null)
            return;
        postOrder(root.left());
        postOrder(root.right());
        System.out.print(root.element() + ";");
    }

   public boolean sumPath(BTNode root, int sum, int sumToCheck)
   {
       if(root==null)
           return false;
       sum+= root.element();

       if(sum==sumToCheck){
           return true;
       }
       else
       {
           if(root.left()==null && root.right()==null)
               return false;

          boolean isPathExists = sumPath(root.left(),sum,sumToCheck);
          if(isPathExists)
              return true;
          isPathExists=sumPath(root.right(),sum,sumToCheck);

           return isPathExists;
       }
   }
}
