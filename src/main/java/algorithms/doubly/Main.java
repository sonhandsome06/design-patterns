package algorithms.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinked doublyLinked = new DoublyLinked(1);

        doublyLinked.append(2);
        doublyLinked.append(3);
        doublyLinked.append(4);
        doublyLinked.append(5);
//        doublyLinked.printList();

//        Node lastNode = doublyLinked.removeLast();
//
//        System.out.println("removed lastNode: " + lastNode.getValue());

//        doublyLinked.prepend(-1);

//        Node firstNode = doublyLinked.removeFirst();
//        System.out.println("removed first: " + firstNode.getValue());

//        System.out.println("get Index: " + doublyLinked.get(1).getValue());

//        doublyLinked.set(1, 5);

//        doublyLinked.insert(2, 10);
//        doublyLinked.remove(4);
        doublyLinked.printList();
    }
}
