public class Main {
    public static void main(String[] args){
        SingleLinkedList SLL = new SingleLinkedList(1);

        SLL.AddNodeAtEnd(2);

        SLL.AddNodeAtEnd(3);

        SLL.AddNodeAtBeginning(100);
        SLL.AddNodeAtBeginning(200);
        SLL.InsertNodeAtPos(3,300);
        SLL.DeleteNodeAtHead();
        SLL.DeleteTailNode();
        //SLL.DeleteNodeAtPos(2000);

       IntNode nodeatpos = SLL.GetNodeAtPos(2);
        System.out.println("The value at selected pos " + nodeatpos.value);
        System.out.println("The length of the list " + SLL.ListLength());
        SLL.PrintList();
    }
}
