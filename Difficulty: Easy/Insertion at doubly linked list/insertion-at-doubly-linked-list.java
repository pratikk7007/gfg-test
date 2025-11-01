/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node newNode=new Node(x);
        newNode.prev=null;
        newNode.next=null;
        Node temp=head;
        int i=0;
        while(true){
            if(i==p){
                if(temp.next==null){
                    temp.next=newNode;
                    newNode.prev=temp;
                    break;
                }
                newNode.prev=temp;
                newNode.next=temp.next;
                temp.next.prev=newNode;
                temp.next=newNode;
               
                break;
            }
            temp=temp.next;
            i++;
        }
        return head;
    }
}