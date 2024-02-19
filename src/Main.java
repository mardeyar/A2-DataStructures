import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize our data to start
        Structures dataStructure = new Structures();
        Random random = new Random();

        // Append method testing
        for (int i = 0; i < 9; i++) {
            dataStructure.append(random.nextInt(20));
        }

        System.out.println("Data structure after append method:");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Prepend method testing
        dataStructure.prepend(random.nextInt(20));

        System.out.println("\n\nData structure after prepend method:");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Size method testing
        System.out.println("\n\nSize of list: " + dataStructure.nodeSize() + " values");

        // Head method testing
        System.out.println("\nHead value: " + dataStructure.nodeHead().data);

        // Tail method testing
        System.out.println("\nTail value: " + dataStructure.nodeTail().data);

        // At position method testing
        int nodeIndex = random.nextInt(dataStructure.nodeSize());
        System.out.println("\nValue at index " + nodeIndex + ": " + dataStructure.atPosition(nodeIndex).data);

        // Pop method testing
        System.out.println("\nData structure before pop method:");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        System.out.println("\nRemoving the last element which is " + dataStructure.nodeTail().data);
        dataStructure.nodePop();

        System.out.println("\nData structure after pop method:");
        for (int i = 0; i < dataStructure.nodeSize(); i++) {
            System.out.print(dataStructure.atPosition(i).data + " ");
        }

        // Contains method testing
        int containsValue = random.nextInt(20);
        System.out.println("\n\nDoes the list contain " + containsValue + ": " + dataStructure.nodeContains(containsValue));

        // Find method testing
        int value = random.nextInt(20);
        Integer index = dataStructure.nodeFind(value);
        if (index != null) {
            System.out.println("\nFound " + value + " at index " + index);
        } else {
            System.out.println("\nValue " + value + " not found");
        }
    }
}