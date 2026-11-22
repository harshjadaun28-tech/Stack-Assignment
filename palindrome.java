class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class CharStack {
    Node top;

    void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        char data = top.data;
        top = top.next;
        return data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class palindrome {
    public static void main(String[] args) {

        String str = "MADAM";

        CharStack stack = new CharStack();

        // Push all characters into Stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean palindrome = true;

        // Compare original string with popped characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}