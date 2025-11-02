/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp=head;
        Stack <Integer>st=new Stack<>();
        while(temp !=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        
        while(!st.isEmpty()){
            
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }
}