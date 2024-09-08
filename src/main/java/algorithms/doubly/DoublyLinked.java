package algorithms.doubly;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoublyLinked {
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinked(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        size = 1;
    }
    public DoublyLinked(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        size ++;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.next;
        }
    }

    public Node removeLast() {
        if (size == 0) {
            return null;
        }
        Node temp = tail;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        size --;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public Node removeFirst() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        size--;
        return temp;
    }

    public Node get(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        Node node = head;

            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        return node;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            return;
        }
        Node node = get(index);
        node.setValue(value);
    }

    public void insert(int index, int value) {
        if (index < 0 || index >= size) {
            return;
        }
        Node node = new Node(value);
        if (index == 0) {
            prepend(value);
        }
        else if (index == size - 1) {
            append(value);
        } else {
            Node after = get(index);
            Node before = get(index-1);

            node.next = after;
            node.prev = before;
            after.prev = node;
            before.next = node;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            removeFirst();
        }
        else if (index == size - 1) {
            removeLast();
        } else {
            Node before = get(index -1);
            Node after = get(index);
            before.next = after.next;
        }

    }
}
