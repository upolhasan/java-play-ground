package datastructure;

/*
* Singly Linked List.
* Should have the following capabilities:
*   insert
*   search / find
*   get
*   delete
*   print
*
* */

public class SLinkedList {

    SLLNode head;

    public SLinkedList(SLLNode SLLNode) {
        this.head = SLLNode;
    }

    public SLinkedList() {
        this(null);
    }

    public SLLNode insertAtHead(SLLNode node){

        if (head != null) {
            node.next = head;
        }
        head = node;

        return head;
    }

    public int getLength(){

        int count = 0;

        while( head != null ){
            count++;
            head = head.next;
        }

        return count;
    }

    public SLLNode getHead() {
        return head;
    }

    // Search for a single occurance not considering the duplicate
    public SLLNode search(SLLNode node){

        SLLNode current = this.head;

        while( current != null) {

            if ( node.val == current.val ){
                return current;
            }
            current = current.next;
        }

        return current;
    }

    public SLLNode delete(SLLNode node) {
        SLLNode prev, current = head;

        while ( current != null ){
            prev = current;

            if (node.val == current.val){
                prev.next = current.next;
                current.next = null;
            }
            current = current.next;

        }
        return head;
    }

    /*
    * Let's have 1 based position
    *
    * */
    public SLLNode getNodeByPos( int pos ) {

        SLLNode node = head;
        if ( pos < 1 ) {
            return null;
        }

        int current = 1;

        while ( current <= pos ) {
            node = node.next;
            current++;
        }

        return node;
    }

    @Override
    public String toString() {

        SLLNode current = head;
        StringBuffer sb = new StringBuffer();

        while( current != null ){
            sb.append(current.val);

            if (current.next != null){
                sb.append("->");
            }
            current = current.next;
        }


        return "SLinkedList:{" +
                 sb.toString() +
               "}";
    }

    public SLLNode createfromArray(int[] num){

        for (int n: num) {
            insertAtHead(new SLLNode(n));
        }
        return head;
    }

    public boolean isCycle() {

        SLLNode slow, fast;
        slow = fast = head;

        // 1 -> 2 -> 3 -> 4 -> 2

        while ( slow !=null && fast != null && fast.next != null ) {

            slow = slow.next;
            fast = fast.next.next;

            if ( fast == slow ) {
                return true;
            }
        }

        return false;
    }

    public SLLNode middle (){

        SLLNode slow = head, fast = head;
        /*
        * 1 2 3 4 5 6
        * 1 2 3 4 5
        * 1
        * */

        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    // TODO: Implement toString for a LinkedList that has cycle
}
