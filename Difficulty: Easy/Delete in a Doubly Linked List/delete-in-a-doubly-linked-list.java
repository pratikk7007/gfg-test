/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if (head == null) return null;

        Node temp = head;
        int i = 1;

        while (temp != null && i < x) {
            temp = temp.next;
            i++;
        }

        if (temp == null) return head;

        
        if (temp.prev == null) {
            head = head.next;
            if (head != null) head.prev = null;
        }
        
        else if (temp.next == null) {
            temp.prev.next = null;
        }
        
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        return head;
    }
}
