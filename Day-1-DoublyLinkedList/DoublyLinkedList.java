public class DoublyLinkedList {
    Node head;
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }
    // Adding a node at the front of the list
    public void insertFirst(int new_data)
    {
        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        // move the head to point to the new node
        head = new_Node;
    }
    // Add a node at the end of the list
    void insertLast(int new_data)
    {
        Node new_node = new Node(new_data);

        Node last = head;

        // This new node is going to be the last node, so make next of it as NULL
        new_node.next = null;

        //If the Linked List is empty, then make the new node as head

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        //Else traverse till the last node
        while (last.next != null)
            last = last.next;

        //Change the next of last node
        last.next = new_node;

        //Make last node as previous of new node
        new_node.prev = last;
    }

    public void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    void deleteNode(Node node)
    {
        // Base case
        if (head == null || node == null) {
            return;
        }
        // If node to be deleted is head node
        if (head == node) {
            head = node.next;
        }
        // Change next only if node to be deleted is npt the last node
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        // Change prev only if node to be deleted is not the first node
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        return;
    }
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;
        //Node current will point to head
        Node current = head;

        //Checks whether the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Compare value to be searched with each node in the list
            if(current.data == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(flag)
            System.out.println("Node is present in the list at the position : " + i);
        else
            System.out.println("Node is not present in the list");
    }


    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertLast(1);
        doublyLinkedList.insertLast(2);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insertLast(4);
        doublyLinkedList.insertLast(5);

        doublyLinkedList.print(doublyLinkedList.head);
        System.out.println();
        doublyLinkedList.searchNode(5);
        doublyLinkedList.deleteNode(doublyLinkedList.head);
        System.out.print("After Deleting the first Node"+" : ");
        doublyLinkedList.print(doublyLinkedList.head);
        System.out.println();

    }

}
