package algorithms.doubly;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node {
    private int value;
    public Node next;
    public Node prev;
    public Node(int value) {
        this.value = value;
    }
}
