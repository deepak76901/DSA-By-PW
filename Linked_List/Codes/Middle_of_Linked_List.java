class Middle_of_Linked_List {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        // Middle_of_Linked_List is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // Middle_of_Linked_List is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    //  implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // implementation of insertion of a node after any node
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    // implementation of deletion of a node in a Middle_of_Linked_List
    void deleteNode(int position){
        //Middle_of_Linked_List is empty
        if(head == null){
            return;
        }

        Node temp = head;
        // deletion is in the beginning of the node
        if(position == 0){
            head = temp.next;
            return;
        }

        // deletion is not in the beginning of the node
        for(int i=0; temp!=null && i< position-1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }

        temp.next = temp.next.next;
    }

    // implementation of reversal of a Middle_of_Linked_List using an iterative approach
    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while(curr != null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        head = prev;
        return;
    }

    // implementation of reversal of a linked list using recursive approach
    public void reversalRec(Node curr, Node prev){
        // last node of a linked list
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        // recusive function call
        reversalRec(nextPtr, curr);
    }

    // implementation of finding out the middle node in a linked list
    // two-pointer approach
    // what is the time and the space complexity of below method??
    public void middleNode(){
        Node slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        System.out.println("Middle data of a given linked list is: "+slowPtr.data);
    }
    

    // implementation of displaying the Middle_of_Linked_List
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Middle_of_Linked_List llist = new Middle_of_Linked_List();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        //llist.insertAtBeginning(19);

    
        System.out.println("After insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

       llist.insertAfter(llist.head.next.next.next, 13);
       llist.displayLL();
        System.out.println();

        /* 
        llist.deleteNode(0);
        System.out.println("Deletion of a node from a Middle_of_Linked_List");
        llist.displayLL();
        System.out.println();
        */

        //llist.reverseLL();
        //llist.reversalRec(llist.head, null);
    
        //System.out.println("Reversal of a Linked List is");
        //llist.displayLL();
        llist.middleNode();
        System.out.println();
    }
}
