class ReverseNode {
    int data;
    ReverseNode next;

    ReverseNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseStackClass {
    ReverseNode top;

    void push(int data) {
        ReverseNode newNode = new ReverseNode(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        ReverseNode temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class ReverseStack {
    public static void main(String[] args) {

        ReverseStackClass original = new ReverseStackClass();
        ReverseStackClass another = new ReverseStackClass();

        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);

        System.out.println("Original Stack:");
        original.display();

        while (!original.isEmpty()) {
            another.push(original.pop());
        }

        System.out.println("Reversed Stack:");
        another.display();
    }
}