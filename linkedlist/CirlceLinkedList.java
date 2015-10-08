package datastructure.linkedlist;

/**
 * Created by DH on 15. 10. 8..
 */
public class CirlceLinkedList extends LinkedList {

    CirlceLinkedList () {
        super( );

    }

    CirlceLinkedList ( int data ) {
        super( data );
        this.head.next.next = this.head.next;
    }

    void NodeAddOnTail ( int data ) {
        this.tail.next = new Node();
        this.tail = this.tail.next;
        this.tail.data = data;
        this.tail.next = this.head.next;
        this.cur = null;
        this.before = null;
        this.numOfData ++;
    }

    void NodeAddOnHead ( int data ) {
        Node newNode = new Node();
        newNode.data = data;
        this.tail.next = newNode;
    }


}
