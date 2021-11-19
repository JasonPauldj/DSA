import java.util.List;

public class SingleLinkedList extends IntNode {
    IntNode head;
    SingleLinkedList(int value) {
        head = new IntNode();
        head.value = value;
    }
    void AddNodeAtEnd(int value)
    {
        IntNode newNode = new IntNode();
        newNode.value = value;
       IntNode tail= ObtainTailNode();
       tail.node=newNode;
    }
    void AddNodeAtBeginning(int value)
    {
        IntNode dupNode = new IntNode();
        dupNode.value =this.head.value;
        dupNode.node = this.head.node;

        IntNode newNode = new IntNode();
        newNode.value = value;
        newNode.node = dupNode;

        this.head = newNode;
    }
    IntNode  ObtainTailNode(){
        IntNode tail = this.head;
        while(tail.node != null){
            tail = tail.node;
        }
        return tail;
    }

    void PrintList(){
        IntNode tail = this.head;
        while(tail.node != null){
            System.out.println(tail.value);
            tail = tail.node;
        }
        System.out.println(tail.value);
    }

    int ListLength(){

        IntNode tail = this.head;
        int cnt =1;
        while(tail.node != null){
            cnt++;
            tail = tail.node;
        }
        return cnt;
    }

    IntNode GetNodeAtPos(int pos){
        try
        {
            if(pos >=0) {
                IntNode tail = this.head;
                int posInList = 0;
                while (tail.node != null && posInList < pos) {
                    posInList++;
                    tail = tail.node;
                }
                if(posInList < pos )
                {
                    throw new Exception("the position is outofbounds");
                }
                return tail;
            }
            else
            {
                throw new Exception("cannot find node for negative values");
            }
        }
       catch( Exception e){
            e.printStackTrace();
            return null;
       }
    }

    void InsertNodeAtPos (int pos,int val){
        try {
            int len = ListLength();
            if(pos <= len-1 && pos >= 0) {

                if(pos ==0) {
                    AddNodeAtBeginning(val);
                }
                else if(pos ==len -1)
                {
                    AddNodeAtEnd(val);
                }
                else {
                    IntNode newNode = new IntNode();
                    newNode.value = val;

                    IntNode nodeAtPos = GetNodeAtPos(pos);
                    IntNode nodeLeftToPos = GetNodeAtPos(pos - 1);

                    newNode.node = nodeAtPos;
                    nodeLeftToPos.node = newNode;
                }
            }
            else
            {
                throw new Exception("trying to insert at a position that is out of bounds");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    void DeleteNodeAtHead (){
        int len = ListLength();
        if(len==1){
            this.head =null;
        }
        else
        {
            this.head=this.head.node;
        }
    }

    void DeleteTailNode (){
        int len = ListLength();
        if(len==1){
            this.head =null;
        }
        else
        {
            IntNode penultimateNode =GetNodeAtPos(len-2);
            penultimateNode.node = null;
        }
    }

    void DeleteNodeAtPos(int pos){
        try {
            int len = ListLength();
            if(pos <= len-1 && pos >= 0) {
                if (pos == 0) {
                    DeleteNodeAtHead();
                } else if (pos == len - 1) {
                    DeleteTailNode();
                } else {
                    IntNode nodeToRight = GetNodeAtPos(pos + 1);
                    IntNode nodeToLeft = GetNodeAtPos(pos - 1);
                    nodeToLeft.node = nodeToRight;
                }
            }
            else {
                throw new Exception("trying to delete at a position that is out of bounds");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }

}
