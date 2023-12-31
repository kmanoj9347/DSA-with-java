package Linked_list;

public class Linked_list_01 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(0);

        // 5 -> 4 -> 1 -> 9 -> 0
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.print(a.data + " ");
        System.out.print(a.next.data + " ");
        System.out.print(a.next.next.data + " ");
        System.out.print(a.next.next.next.data + " ");
        System.out.print(a.next.next.next.next.data + " ");

    }
}
