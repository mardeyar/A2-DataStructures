public class Structures {

    /**
     * Class to represent a node in a doubly linked list
     */
    static class Node {
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

    /**
     * Appends a new node containing a value to the end of the list if the value is not already present
     * @param value Value to be appended
     */
    public void append(int value) {
        if (!nodeContains(value)) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
            }
            tail = newNode;
        }
    }

    /**
     * Adds a new node containing the specified value to the start of the list
     * @param value Value to be prepended
     */
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

    /**
     * Finds the total number of nodes in the list
     * @return Total number of nodes
     */
    public int nodeSize() {
        int nodeCount = 0;
        Node current = head;
        while (current != null) {
            nodeCount++;
            current = current.next;
        }
        return nodeCount;
    }

    /**
     * Get the first node in the list
     * @return First node in list
     */
    public Node nodeHead() {
        return head;
    }

    /**
     * Get the last node in the list
     * @return Last node in list
     */
    public Node nodeTail() {
        return tail;
    }

    /**
     * Gets the node at the given index
     * @param index Index of the node to be returned
     * @return The node at the specified index, or, null if index is out of range
     */
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

    /**
     * Removes last element from the list
     */
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

    /**
     * Takes a value to check whether the list contains a node with the given value
     * @param value Value to be searched for
     * @return True: if the passed value is in the list. False: if passed value is NOT in the list
     */
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

    /**
     * Searches the list for a node containing the passed value
     * @param value Value to be searched
     * @return Index of the node containing the value, or, null if not found
     */
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
