package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SLinkedListTest {

    SLinkedList linkedList;
    @BeforeEach
    void setUp() {
        linkedList = new SLinkedList();
    }


    @Test
    void insertAtHead() {
        SLLNode head = linkedList.createfromArray(new int[]{1,2,3});
        linkedList.insertAtHead(new SLLNode(4));
        assertEquals("SLinkedList:{4->3->2->1}", linkedList.toString());
    }

    @Test
    void getLength() {

        SLLNode head = linkedList.createfromArray(new int[]{1,2,3});
        assertEquals(3, linkedList.getLength());
    }

    @Test
    void getHead() {
    }

    @Test
    void search() {
    }

    @Test
    void delete() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testCreatefromArray() {
        SLLNode head = linkedList.createfromArray(new int[]{1,2,3,4,5});
        assertEquals("SLinkedList:{5->4->3->2->1}", linkedList.toString() );
    }
}