// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node temp;
    int size;

    public myStack() {
        // Initialize your data members
        temp = null;
        size = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return temp == null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newNode = new Node(x);
        newNode.next = temp;
        temp = newNode;
        size++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if (temp != null) {
            temp = temp.next;
            size--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        
        if (temp == null) return -1;
        return temp.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
