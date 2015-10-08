package datastructure.linkedlist;

/**
 * Created by DH on 15. 10. 8..
 */
public class LinkedList {
    Node head;
    Node tail;
    Node cur;
    Node before;
    int numOfData;

    LinkedList () {
        this.head = new Node();
        this.head.next = null;
        this.tail = this.head;
        this.cur = null;
        this.before = null;
        this.numOfData = 0;
    }

    LinkedList ( int data ) {
        this.head = new Node();
        this.head.next = new Node();
        this.head.next.next = null;
        this.head.next.data = data;
        this.tail = this.head.next;
        this.cur = null;
        this.before = null;
        this.numOfData = 1;
    }

    void nodeAddOnTail ( int data ) {
        this.tail.next = new Node();
        this.tail = this.tail.next;
        this.tail.data = data;
        this.tail.next = null;
        this.cur = null;
        this.before = null;
        this.numOfData ++;
    }

    void nodeAddOnHead ( int data ) {
        Node newNode = new Node();
        newNode.next = this.head.next;
        newNode.data = data;
        this.head.next = newNode;
        this.cur = null;
        this.before = null;
        this.numOfData ++;
    }

    int lFirst () {
        this.cur = this.head.next;
        this.before = this.head;
        return this.cur.data;
    }

    int lNext () {
        this.before = this.cur;
        this.cur = this.before.next;
        return this.cur.data;
    }

    int delCurNode () {
            int delData = this.cur.data;
            this.cur = this.before;
            this.numOfData--;
            return delData;
    }

}

class Node {
    int data;
    Node next;
}
