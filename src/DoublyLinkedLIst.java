public class DoublyLinkedLIst
{
    Node head;
    
    void addNode(Node newNode){  //Adds a node to end of a doubly linked list
        if(head==null){  //If head is already null
            head=newNode;
        }
        else{  //If head is not null
            Node current = head;
            while(current.next!=null){  //Iterate through linked list
                current = current.next;
            }
            current.next=newNode;
            newNode.prev = current;
        }
    }

    void printNode(){  //Prints elements of linked list from first to last
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void printNodeFromEnd(Node tail){  //Actually takes last node from user(could be any node at end or middle) and prints from that to start
        Node current = tail;

        while(current!=null){
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedLIst dllObj = new DoublyLinkedLIst(); //Object
        Node first = new Node(10);  //Node 1
        Node second = new Node(11); //Node 2
        Node third = new Node(15); //Node 3
        dllObj.addNode(first);
        dllObj.addNode(second);
        dllObj.addNode(third);
        dllObj.printNode();
        System.out.println();
        dllObj.printNodeFromEnd(third);
    }
}

class Node{  //Node class
    Node prev;  //Previous node pointer
    Node next;  //Next node pointer
    int data;  //Data being stored in node

    public Node(int data) {  //Constructor
        this.data = data;
        this.next=null;
        this.prev=null;
    }
}
