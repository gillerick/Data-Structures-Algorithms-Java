package Examples;

class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {
        Node n = head;

        if (n.data == d) {
            return head.next; /* Moved head*/
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n = new Node(23);
        n.appendToTail(67);
        n.appendToTail(76);
        n.appendToTail(43);
//        n.deleteNode()
        System.out.println(n);
//        System.out.println(n.appendToTail(56));

    }
}
