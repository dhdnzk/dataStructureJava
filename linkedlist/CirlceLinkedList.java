package datastructure.linkedlist;

/**
 * Created by DH on 15. 10. 8..
 * Last modify : 15. 10. 9..
 */
public class CirlceLinkedList extends LinkedList {

    CirlceLinkedList () {
        super( );

    }

    CirlceLinkedList ( Data data ) {
        super( data );
        this.head.next.next = this.head.next;
    }

    void NodeAddOnTail ( Data data ) {
        super.nodeAddOnTail( data );
        this.tail.next = this.head.next;

    }

    void NodeAddOnHead ( Data data ) {
        super.nodeAddOnHead( data );
    }



}
