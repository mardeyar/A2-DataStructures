public class Structures {

    class Node {
        int data;
        Node prev;
        Node next;

        // Node constructor
        public Node(int data) {
            this.data = data;
        }
    }

    // Initialize to null globally
    Node head, tail = null;

    // Append adds a new node containing a value to the end of the list
    public void append(int value) {
        if (!nodeContains(value)) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    }

    // Adds a new node to the start of the list
    public void prepend(int value) {
        if (!nodeContains(value)) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
    }

    // Returns the total number of nodes in the list
    public int nodeSize() {
        int nodeCount = 0;
        Node current = head;
        while (current != null) {
            nodeCount++;
            current = current.next;
        }
        return nodeCount;
    }

    // Returns the first node in the list
    public Node nodeHead() {
        return head;
    }

    // Returns the last node in the list
    public Node nodeTail() {
        return tail;
    }

    // Returns the node at the given index
    public Node atPosition(int index) {
        if (index < 0 || index >= nodeSize()) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Removes last element from the list
    public void nodePop() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    // Returns true if the passed value is in the list, else, return false
    public boolean nodeContains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns the index of the node containing the value, null if not found
    public Integer nodeFind(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return null;
    }
}
