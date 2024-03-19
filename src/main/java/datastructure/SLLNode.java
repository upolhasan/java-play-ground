package datastructure;


/*
* A linked list node will contain a next pointer and data
*
* */
public class SLLNode {

    SLLNode next;
    int val;

    // Constructor to create a standalone Node
    public SLLNode(int val){
        this(val, null);
    }

    public SLLNode( int val, SLLNode nextNode ){
        this.val = val;
        this.next = nextNode;
    }




}
