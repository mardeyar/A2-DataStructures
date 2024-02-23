import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize our data to start
        Structures dataStructure = new Structures();
        Random random = new Random();

        System.out.println("\n****** DATA STRUCTURE METHOD TESTING ******\n");

        // Append method testing
        System.out.println("=== Append method ===");
        for (int i = 0; i < 9; i++) {
            dataStructure.append(random.nextInt(20));
        }

        System.out.print("Data structure after append method: ");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Prepend method testing
        System.out.println("\n\n=== Prepend method ===");
        dataStructure.prepend(random.nextInt(20));

        System.out.print("Data structure after prepend method: ");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Size method testing
        System.out.println("\n\n=== Node size method ===");
        System.out.println("Size of list: " + dataStructure.nodeSize() + " values");

        // Head method testing
        System.out.println("\n=== Node head method ===");
        System.out.println("Head value: " + dataStructure.nodeHead().data);

        // Tail method testing
        System.out.println("\n=== Node tail method ===");
        System.out.println("Tail value: " + dataStructure.nodeTail().data);

        // At position method testing
        System.out.println("\n=== Node position method ===");
        int nodeIndex = random.nextInt(dataStructure.nodeSize());
        System.out.println("Value at index " + nodeIndex + ": " + dataStructure.atPosition(nodeIndex).data);

        // Pop method testing
        System.out.println("\n=== Pop method ===");
        System.out.print("Data structure before pop method: ");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        System.out.println("\nRemoving the last element which is " + dataStructure.nodeTail().data);
        dataStructure.nodePop();

        System.out.print("Data structure after pop method: ");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Contains method testing
        System.out.println("\n\n=== Node contains method ===");
        int containsValue = random.nextInt(20);
        System.out.println("Does the list contain " + containsValue + ": " + dataStructure.nodeContains(containsValue));

        // Find method testing
        System.out.println("\n=== Node find method ===");
        int value = random.nextInt(20);
        Integer index = dataStructure.nodeFind(value);
        if (index != null) {
            System.out.println("Found '" + value + "' at index " + index);
        } else {
            System.out.println("Value '" + value + "': not found");
        }
    }
}