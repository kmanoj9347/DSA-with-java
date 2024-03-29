// Find the middle element of the given linked list.
package Linked_list.Practice;

public class Practice_06 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node middleElement(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(10);
        Node e = new Node(24);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = middleElement(a);
        display(a);
    }
}
