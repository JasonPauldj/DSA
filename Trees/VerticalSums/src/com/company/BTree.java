package com.company;

import java.util.TreeMap;

public class BTree {

    static int [] verticalSums = new int[10];
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

    public void VerticalSumMain() { VerticalSum(root); }

    // A wrapper over VerticalSumUtil()
    private void VerticalSum(BTNode root) {

        // base case
        if (root == null) { return; }

        // Creates an empty TreeMap hM
        TreeMap<Integer, Integer> hM =
                new TreeMap<Integer, Integer>();

        // Calls the VerticalSumUtil() to store the
        // vertical sum values in hM
        VerticalSumUtil(root, 0, hM);

        // Prints the values stored by VerticalSumUtil()
        if (hM != null) {
            System.out.println(hM.entrySet());
        }
    }

    // Traverses the tree in in-order form and builds
    // a hashMap hM that contains the vertical sum
    private void VerticalSumUtil(BTNode root, int hD,
                                 TreeMap<Integer, Integer> hM) {

        // base case
        if (root == null) {  return; }
        int prevSum = (hM.get(hD) == null) ? 0 : hM.get(hD);
        hM.put(hD, prevSum + root.element());
        // Store the values in hM for left subtree
        VerticalSumUtil(root.left(), hD - 1, hM);

        // Update vertical sum for hD of this node


        // Store the values in hM for right subtree
        VerticalSumUtil(root.right(), hD + 1, hM);
    }

  public void calculateVertical(BTNode root, int verticalValue)
   {
      if(root==null)
          return ;

       calculateVertical(root.left(),verticalValue-1);
       calculateVertical(root.right(),verticalValue+1);
       verticalSums[verticalValue]+= root.element();
   }

   public void printVertical(){
       for (int x: verticalSums
            ) {
           System.out.print(x+";");
       }
   }
}
