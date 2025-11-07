class myStack {
    
    private int[] arr;
    private int top;
    private int n;

    public myStack(int n) {
        // Define Data Structures
        this.n = n;
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if (top == n - 1) {
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (!isFull()) {
            top++;
            arr[top] = x;
        }
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (!isEmpty()) {
            top--;
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }
}
