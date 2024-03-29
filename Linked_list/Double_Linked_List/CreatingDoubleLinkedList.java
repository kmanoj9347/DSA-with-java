package Linked_list.Double_Linked_List;

public class CreatingDoubleLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;

        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    // Dispplay the list in reverse order.
    public static void displayRev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;

        }
        System.out.println();
    }

    public static void displayRandom(Node ramdom) {
        Node temp = ramdom;
        // Move the node till head of the list
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // print the list from the head
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(2);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        System.out.println("Displaying Linked list");
        display(a); // 5 4 1 9 2
        System.out.println("Displaying Reverse Linked list");
        displayRev(e); // 2 9 1 4 5
        System.out.println("Displaying Linked list using random node");
        displayRandom(c); // 5 4 1 9 2

    }

}
