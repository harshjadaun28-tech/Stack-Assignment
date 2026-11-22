class MiddleNode {
    int data;
    MiddleNode next;

    MiddleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MiddleStackClass {
    MiddleNode top;

    // Push operation
    void push(int data) {
        MiddleNode newNode = new MiddleNode(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    // Display stack
    void display() {
        MiddleNode temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Find middle element
    void findMiddle() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        MiddleNode slow = top;
        MiddleNode fast = top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }
}

public class MiddleStack {
    public static void main(String[] args) {

        MiddleStackClass stack = new MiddleStackClass();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack:");
        stack.display();

        stack.findMiddle();
    }
}